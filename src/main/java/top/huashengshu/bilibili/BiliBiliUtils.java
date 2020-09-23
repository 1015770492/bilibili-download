package top.huashengshu.bilibili;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import top.huashengshu.bilibili.utils.http.BiliBiliHttpUtils;
import top.huashengshu.bilibili.utils.merge.MergeVideoAndAudioUtils;

import java.util.List;
import java.util.concurrent.*;

public class BiliBiliUtils {

    private static ExecutorService executorService = Executors.newFixedThreadPool(3);//创建5个线程，太大了容易被封ip


    /**
     * 测试案例
     *
     * @param args
     */
    public static void main(String[] args) {
        String referUrl = "https://www.bilibili.com/video/BV1PJ411n7xZ?from=search&seid=18443550776238916771";//测试用的url
        BiliBiliUtils.patchDownload(referUrl, "D:/");//将referUrl系列的所有视频存到D:/盘

    }

    /**
     * 返回id最大的元素的base_url
     *
     * @param videos
     * @return
     */
    private static String getUrlByMaxValue(JSONArray videos) {
        return videos.parallelStream().map(o -> {
            return (JSONObject) o;
        }).max((x, y) -> {
            Integer xid = x.getInteger("id");
            Integer yid = x.getInteger("id");
            return xid > yid ? xid : yid;
        }).get().getString("base_url");
    }

    /**
     * 批量下载 图像文件和音频文件  将referUrl下这一系列的视频存入到 driveName盘中
     *
     * @param referUrl
     * @param driveName
     */
    public static void patchDownload(String referUrl, String driveName) {
        if (driveName.isBlank()) {
            driveName = "F:/";//默认F盘
        }
        JSONObject cidsJSON = null;
        try {
            cidsJSON = BiliBiliHttpUtils.getCidJSON(referUrl);//获取cid和视频标题名
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<JSONObject> playUrlList = BiliBiliHttpUtils.getPlayUrlList(cidsJSON);//封装cid和视频标题，以及获取播放地址
        String finalDriveName = driveName;
        playUrlList.parallelStream().forEach(playUrlObj -> {
            String directName = playUrlObj.getString("directName");//视频标题--》文件名前缀
            String videoName = playUrlObj.getString("videoName");//视频标题--》文件名前缀

            JSONObject dashJson = playUrlObj.getJSONObject("dash");
            JSONArray videos = dashJson.getJSONArray("video");//视频的图像
            JSONArray audios = dashJson.getJSONArray("audio");//视频的音频

            String videoUrl = getUrlByMaxValue(videos);//返回画质最高的链接
            String audioUrl = getUrlByMaxValue(audios);//返回音质最高的链接

            String videoSavePath = new StringBuilder(finalDriveName).append(directName).append("/").append(videoName).append(".video").toString();
            String audioSavePath = new StringBuilder(finalDriveName).append(directName).append("/").append(videoName).append(".audio").toString();


            CompletableFuture<Boolean> vflag = CompletableFuture.supplyAsync(() -> {
                return BiliBiliHttpUtils.downloadFile(referUrl, videoUrl, videoSavePath);//下载图像文件
            },executorService);
            CompletableFuture<Boolean> aflag = CompletableFuture.supplyAsync(() -> {
                return BiliBiliHttpUtils.downloadFile(referUrl, audioUrl, audioSavePath);//下载音频文件
            },executorService);
            vflag.thenAcceptBoth(aflag,(video,audio)->{
                if (video && audio){
                    System.out.println(new StringBuilder("开始合并：\n").append(videoSavePath).append("\n").append(audioSavePath));
                    CompletableFuture.runAsync(() -> {
                        try {
                            MergeVideoAndAudioUtils
                                    .merge(
                                            videoSavePath,
                                            audioSavePath,
                                            new StringBuilder(finalDriveName).append(directName).append("/").append(videoName).append(".mp4").toString());
                        } catch (ExecutionException e) {
                            e.printStackTrace();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    },executorService);
                }
            });



        });


    }
}

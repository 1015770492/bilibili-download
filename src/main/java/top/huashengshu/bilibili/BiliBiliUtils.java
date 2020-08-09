package top.huashengshu.bilibili;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import top.huashengshu.bilibili.utils.http.BiliBiliHttpUtils;
import top.huashengshu.bilibili.utils.merge.MergeVideoAndAudioUtils;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class BiliBiliUtils {

    private static ExecutorService executorService = Executors.newFixedThreadPool(50);


    /**
     * 测试案例
     *
     * @param args
     */
    public static void main(String[] args) {
//        String url = "http://upos-sz-mirrorks3.bilivideo.com/upgcxcode/71/89/193638971/193638971-1-30280.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596809841&gen=playurl&os=ks3bv&oi=1993628866&trid=cfdbfe592fde4237a2706941d6b6b61du&platform=pc&upsig=1d36fac3406db4ba7e7069d5a74eb2f3&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=0,3&agrr=0&logo=80000000";
//        String bvidUrl = "https://api.bilibili.com/x/player/pagelist?bvid=BV1m4411H7pi&jsonp=jsonp";
//        String referUrl = "https://www.bilibili.com/video/BV16K411J754?from=search&seid=7571931833026679506";//测试用的url
        String referUrl = "https://www.bilibili.com/video/BV1rT4y137Lu?from=search&seid=2039503208193595218";//测试用的url

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
                    executorService.execute(() -> {
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
                    });
                }
            });



        });


    }
}

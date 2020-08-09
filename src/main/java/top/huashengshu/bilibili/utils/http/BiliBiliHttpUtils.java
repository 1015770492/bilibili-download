package top.huashengshu.bilibili.utils.http;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiliBiliHttpUtils {


    /**
     * 构建公共请求头
     *
     * @param url
     * @return
     */
    public static HttpRequest.Builder getRequestForHTML(String url) {
        HttpRequest.Builder accept = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .timeout(Duration.ofMinutes(2))
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36 SE 2.X MetaSr 1.0")
                .header("Accept", "*/*")
                .header("Accept-Encoding", "gzip, deflate, br");
        return accept;
    }

    /**
     * 构建公共请求头
     *
     * @param url
     * @return
     */
    public static HttpRequest.Builder getRequestForJSON(String url) {
        HttpRequest.Builder accept = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .timeout(Duration.ofMinutes(2))
                .header("Content-Type", "application/json")//设置请求头
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36 SE 2.X MetaSr 1.0")
                .header("Accept", "*/*")
                .header("Accept-Encoding", "gzip, deflate, br");
        return accept;
    }


    public static boolean createDir(String destDirName) {
        File file = new File(destDirName);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        return true;
    }


    /**
     * 下载文件的作用，需要3个参数 资源原路径，真正下载的url，保存本地的路径
     *
     * @param refererUrl 视频的参考路径，
     * @param url        真正下载的url链接，可以是m4s文件和audio文件，下载后需要合并
     * @param savePath   保存的路径
     * @return 下载成功则返回true，中间报异常退出则返回false
     */
    public static boolean downloadFile(String refererUrl, String url, String savePath) {
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)//支持 Http2.0， http1.1直接Version.HTTP_1_1
                .followRedirects(HttpClient.Redirect.NORMAL)//自动重定向
                .connectTimeout(Duration.ofSeconds(20))//连接超时设置
                .build();//创建一个客户端
        //2.构建请求体
        HttpRequest request = getRequestForJSON(url)
                .header("referer", refererUrl)//来自那个视频例如：https://www.bilibili.com/video/BV1m4411H7pi
                .GET()
                .build();

        //3.发送请求获取数据
        CompletableFuture<HttpResponse<InputStream>> context = client.sendAsync(request, HttpResponse.BodyHandlers.ofInputStream());//传入InputStream泛型，这样通过body可以获取输入流
        try (InputStream is = context.get().body();) {//java9新特性自动关闭流
            boolean flag = createDir(savePath);
            if (flag) {
                try (FileOutputStream fos = new FileOutputStream(savePath);) {
                    is.transferTo(fos);//写入输出流
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        } catch (ExecutionException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


    /**
     * 获取url中的 bvid
     *
     * @param url
     * @return
     * @throws Exception
     */
    public static String getBVID(String url) throws Exception {
        Pattern BVIDPartPattern = Pattern.compile("BV[a-z|0-9|A-Z]*");
        Matcher matcher = BVIDPartPattern.matcher(url);
        String bvid;
        if (matcher.find()) {
            bvid = matcher.group();
        } else {
            throw new Exception("传入的url中不包含bvid");
        }
        return bvid;
    }

    /**
     * 传入视频的播放地址，例如url: "https://www.bilibili.com/video/BV1m4411H7pi"  获取其中包含BV的这串字符串
     *
     * @param url
     * @return
     * @throws Exception
     */
    public static JSONObject getCidJSON(String url) throws Exception {
        String bvid = getBVID(url);
        //从url中转换成最终请求的url接口
        String requestUrl = new StringBuilder("http://api.bilibili.com/x/web-interface/view?bvid=").append(bvid).toString();
        String jsonString = new RestTemplate().getForEntity(requestUrl, String.class).getBody();
        JSONObject parse = JSONObject.parseObject(jsonString);
        return parse.getJSONObject("data");//返回data部分
    }


    /**
     * 传入cid的json数组，获取所有下载链接--》一个cid对应一个视频，一个视频有多个清晰度的播放源
     *
     * @param cidJSONObject
     * @return
     */
    public static List<JSONObject> getPlayUrlList(JSONObject cidJSONObject) {
        String bvid = cidJSONObject.getString("bvid");//视频的id
        String title = cidJSONObject.getString("title");//标题--》用来做文件夹
        String picUrl = cidJSONObject.getString("pic");//封面


        JSONArray pages = cidJSONObject.getJSONArray("pages");//包含这一系列视频的cid内容
        Stream<JSONObject> jsonObjectStream =
                pages.parallelStream()
                        .map(o -> {
                            JSONObject obj = (JSONObject) o;
                            String cid = obj.getString("cid");//获取cid
                            String part = obj.getString("part");//获取视频名  前缀

                            String requestUrl = new StringBuilder("https://api.bilibili.com/x/player/playurl?cid=").append(cid)
                                    .append("&bvid=").append(bvid).append("&qn=64&fnver=0&fnval=16&fourk=1").toString();
                            String jsonString = new RestTemplate().getForEntity(requestUrl, String.class).getBody();

                            JSONObject parse = JSONObject.parseObject(jsonString).getJSONObject("data");
                            parse.put("cid", cid);//将cid添加到返回的数据中
                            parse.put("directName", title);//将cid添加到返回的数据中
                            parse.put("videoName", part);//将视频标题名添加到json中
                            return parse;
                        });
//        System.out.println(cidJSONObject);

        return jsonObjectStream.collect(Collectors.toList());//将收集到的url封装起来
    }

}

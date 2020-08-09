package top.huashengshu.bilibili.utils.spider;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import top.huashengshu.bilibili.utils.http.BiliBiliHttpUtils;

import java.net.http.HttpResponse;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class BiliBiliSpiderUtils {
    public static void main(String[] args) {
//        String refererUrl = "https://www.bilibili.com/video/BV1pK4y1t7SJ";
//        String refererUrl = "https://www.dogedoge.com/";
//
//        RestTemplate restTemplate = new RestTemplate();
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAcceptCharset(List.of(Charset.forName("utf-8")));
//        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
//        HttpEntity<String> entity = new HttpEntity<>(headers);
//
//        ResponseEntity<String> exchange = restTemplate.exchange(refererUrl, HttpMethod.GET, entity, String.class);
//        System.out.println(exchange.getBody());
//        Document parse = Jsoup.parse(exchange.getBody());
//        System.out.println(parse.toString());

//            HttpResponse<String> send = BiliBiliHttpUtils.client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
//            System.out.println(send.body());


//        Document html = Jsoup.parse(htmlStr);
//        Elements ul = html.getElementsByClass("list-box");
//        ul.get(0).getElementsByTag("li").parallelStream().forEach(a -> {
//            String title = a.getElementsByTag("a").get(0).attr("title");
//            System.out.println(title);
//        });
    }
//    public static JSONObject getVideoList(String refererUrl) {
//        String htmlStr = new RestTemplate().getForEntity(refererUrl, String.class).getBody();
//        Document html = Jsoup.parse(htmlStr);
//        Elements ul = html.getElementsByClass("list-box");
//        ul.get(0).getElementsByTag("li").parallelStream().forEach(a -> {
//            String title = a.getElementsByTag("a").get(0).attr("title");
//            System.out.println(title);
//        });
//        return new JSONObject();
//    }
}

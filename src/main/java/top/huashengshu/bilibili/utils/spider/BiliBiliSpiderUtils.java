package top.huashengshu.bilibili.utils.spider;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import top.huashengshu.bilibili.utils.http.BiliBiliHttpUtils;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class BiliBiliSpiderUtils {
    public static void main(String[] args) {
        String refererUrl = "https://www.bilibili.com/video/BV1pK4y1t7SJ";
//        String refererUrl = "https://www.baidu.com/";


        WebClient webClient = WebClient.create();
        WebClient.RequestHeadersSpec<?> uri = webClient.get().uri(refererUrl);

        HttpRequest build = BiliBiliHttpUtils.getRequestForHTML(refererUrl)
                .headers("accept-encoding","utf-8")
                .headers("Referrer-Policy","no-referrer-when-downgrade").GET().build();

        try {
            HttpResponse<String> stringHttpResponse = HttpClient.newHttpClient().send(build, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
            System.out.println(stringHttpResponse.headers().toString());
            System.out.println(stringHttpResponse.body());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAcceptCharset(List.of(StandardCharsets.UTF_8));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<String> exchange = restTemplate.exchange(refererUrl, HttpMethod.GET, entity, String.class);

//        System.out.println(exchange.getBody());



//        Document parse = Jsoup.parse(exchange.getBody());
//        System.out.println(parse.toString());

//        HttpResponse<String> send = BiliBiliHttpUtils.client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
//        System.out.println(send.body());


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

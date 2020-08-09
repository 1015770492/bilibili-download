package top.huashengshu.bilibili.utils.spider;

public class BiliBiliSpiderUtils {
    public static void main(String[] args) {
        String refererUrl = "https://www.bilibili.com/video/BV1pK4y1t7SJ";

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

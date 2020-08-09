package top.huashengshu.bilibili.utils.headerUtils;

import java.util.HashMap;

/**
 * 暂时这个请求头工具还没有用上
 */
public class BiliBiliHttpHeaderUtils {
    /**
     * 下面是类的属性，所有实例全局共用
     */
    private static HashMap<String, String> headerMap = new HashMap<>();//临时存储http请求头的一个成员属性
    private static HashMap<String, String> userInfoHeaderMap = new HashMap<>();//用户信息请求头
    private static HashMap<String, String> loginAuthHeaderMap = new HashMap<>();//登录请求头
    private static HashMap<String, String> loginAuthVaHeaderMap = new HashMap<>();//登录授权的验证请求头
    private static HashMap<String, String> mobileHeaderMap = new HashMap<>();//手机端的请求头
    private static HashMap<String, String> appHeaderMap = new HashMap<>();//app端的请求头

    final static String UA_PC_Sogo = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36 SE 2.X MetaSr 1.0";
    final static String UA_PC_Firefox = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:65.0) Gecko/20100101 Firefox/65.0";
    final static String UA_Android = "Mozilla/5.0 (Linux; Android 5.0; SM-G900P Build/LRX21T) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Mobile Safari/537.36";
    final static String UA_ForAppOnly = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.119 Safari/537.36";

    /**
     * 清除请求头数据
     */
    public static void clearHeaderMap() {
        headerMap.clear();
    }

    public static void clearUserInfoHeaderMap() {
        userInfoHeaderMap.clear();
    }

    public static void clearLoginAuthHeaderMap() {
        loginAuthHeaderMap.clear();
    }

    public static void clearLoginAuthVaHeaderMap() {
        loginAuthVaHeaderMap.clear();
    }

    public static void clearMobileHeaderMap() {
        mobileHeaderMap.clear();
    }

    public static void clearAppHeaderMap() {
        appHeaderMap.clear();
    }


    /**
     * 该Header配置用于用户信息/登录状态获取
     */
    public static HashMap<String, String> getBiliUserInfoHeaders() {
        if (userInfoHeaderMap.size() == 0) {//第一次则直接设置请求头
            userInfoHeaderMap.put("Accept", "application/json, text/plain, */*");
            userInfoHeaderMap.put("Accept-Encoding", "gzip, deflate, sdch, br");
            userInfoHeaderMap.put("Accept-Language", "zh-CN,zh;q=0.8");
            userInfoHeaderMap.put("Connection", "keep-alive");
            userInfoHeaderMap.put("Origin", "https://message.bilibili.com");
            userInfoHeaderMap.put("Host", "api.bilibili.com");
            userInfoHeaderMap.put("Referer", "https://message.bilibili.com/pages/nav/index_new_pc_sync");
            userInfoHeaderMap.put("User-Agent", UA_PC_Sogo);
        }
        return userInfoHeaderMap;
    }

    /**
     * 该Header配置用于登录AuthKey获取
     */
    public HashMap<String, String> getBiliLoginAuthHeaders() {
        if (loginAuthHeaderMap.size() == 0) {//第一次则直接设置请求头
            loginAuthHeaderMap.put("Accept", "application/json, text/javascript, */*; q=0.01");
            loginAuthHeaderMap.put("Accept-Encoding", "gzip, deflate, sdch, br");
            loginAuthHeaderMap.put("Accept-Language", "zh-CN,zh;q=0.8");
            loginAuthHeaderMap.put("Connection", "keep-alive");
            loginAuthHeaderMap.put("Host", "passport.bilibili.com");
            loginAuthHeaderMap.put("Referer", "https://passport.bilibili.com/login");
            loginAuthHeaderMap.put("X-Requested-With", "XMLHttpRequest");
            loginAuthHeaderMap.put("User-Agent", UA_PC_Sogo);
        }
        return loginAuthHeaderMap;//说明前面已经设置好了数据，直接返回
    }

    /**
     * 该Header配置用于登录AuthKey验证
     */
    public HashMap<String, String> getBiliLoginAuthVaHeaders() {
        if (loginAuthVaHeaderMap.size() == 0) {//第一次
            loginAuthVaHeaderMap.put("Accept", "application/json, text/javascript, */*; q=0.01");
            loginAuthVaHeaderMap.put("Accept-Encoding", "gzip, deflate, br");
            loginAuthVaHeaderMap.put("Accept-Language", "zh-CN,zh;q=0.8");
            loginAuthVaHeaderMap.put("Connection", "keep-alive");
            loginAuthVaHeaderMap.put("Host", "passport.bilibili.com");
            loginAuthVaHeaderMap.put("Origin", "https://passport.bilibili.com");
            loginAuthVaHeaderMap.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            loginAuthVaHeaderMap.put("Referer", "https://passport.bilibili.com/login");
            loginAuthVaHeaderMap.put("X-Requested-With", "XMLHttpRequest");
            loginAuthVaHeaderMap.put("User-Agent", UA_PC_Sogo);
        }
        return loginAuthVaHeaderMap;
    }
    /**
     * 该Header配置用于移动端视频下载/网页访问
     */
    public static HashMap<String, String> getBiliMHeaders() {
        if (mobileHeaderMap.size() == 0) {
            mobileHeaderMap = new HashMap<String, String>();
            mobileHeaderMap.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
            mobileHeaderMap.put("Accept-Encoding", "gzip, deflate, sdch, br");
            mobileHeaderMap.put("Accept-Language", "zh-CN,zh;q=0.8");
            mobileHeaderMap.put("Connection", "keep-alive");
            mobileHeaderMap.put("Cache-Control", "max-age=0");
            mobileHeaderMap.put("Host", "m.bilibili.com");
            mobileHeaderMap.put("User-Agent", UA_ForAppOnly);
        }
        return mobileHeaderMap;
    }

    /**
     * 该Header配置用于app版权视频下载
     */
    public static HashMap<String, String> getBiliAppDownHeaders() {
        if (appHeaderMap.size() == 0) {
            appHeaderMap.put("User-Agent", "Bilibili Freedoooooom/MarkII");
        }
        return appHeaderMap;
    }

    /**
     * 该Header配置用于FLV视频下载
     *
     * @param avId
     * @return
     */
    public HashMap<String, String> getBiliWwwFLVHeaders(String avId) {
        clearHeaderMap();//清除头数据
        headerMap.put("X-Requested-With", "ShockwaveFlash/28.0.0.137");
        headerMap.put("Referer", new StringBuilder().append("https://www.bilibili.com/video/").append(avId).toString());// need addavId
        headerMap.put("User-Agent", UA_PC_Sogo);
        return headerMap;
    }

    /**
     * 该Header配置用于M4s视频下载
     */
    public HashMap<String, String> getBiliWwwM4sHeaders(String avId) {
        getCommonHeaders();
        headerMap.put("Referer", "https://www.bilibili.com/video/" + avId);// need add avId
        return headerMap;
    }

    /**
     * 该Header配置用于api 信息查询
     * avId/bvId
     */
    public static HashMap<String, String> getBiliJsonAPIHeaders(String refererUrl) {
        getBiliAppJsonAPIHeaders();
        headerMap.put("Referer", refererUrl);// need addavId
        headerMap.put("User-Agent", UA_PC_Sogo);
        headerMap.put("X-Requested-With", "ShockwaveFlash/28.0.0.137");
        return headerMap;
    }

    /**
     * 该Header配置用于api 信息查询(版权限制，只能在app上看的那种)
     */
    public static HashMap<String, String> getBiliAppJsonAPIHeaders() {
        getCommonHeaders("app.bilibili.com");
        headerMap.put("Accept", "*/*");
        headerMap.put("Referer", "https://app.bilibili.com");
        headerMap.put("User-Agent",UA_ForAppOnly);
        headerMap.put("X-Requested-With", "ShockwaveFlash/28.0.0.137");
        return headerMap;
    }



    /**
     * 该Header配置用于获取个人的所有收藏夹
     */
    public static HashMap<String, String> getAllFavListHeaders(String personId) {
        getCommonHeaders("api.bilibili.com");//设置Host
        headerMap.put("Accept", "application/json, text/plain, */*");//覆盖设置
        headerMap.put("Cache-Control", "no-cache");//覆盖设置
        headerMap.put("Pragma", "no-cache");// 添加的头
        headerMap.put("Origin", "https://space.bilibili.com");//添加的头
        headerMap.put("Referer", new StringBuilder("https://space.bilibili.com/").append(personId).append("/favlist").toString());
        return headerMap;
    }

    /**
     * 该Header配置用于获取收藏夹信息
     */
    public static HashMap<String, String> getFavListHeaders(String personId, String favID) {
        getAllFavListHeaders(personId);
        //覆盖设置
        headerMap.put("Referer", new StringBuilder("https://space.bilibili.com/").append(personId).append("/favlist?fid=").append(favID).append("&ftype=create").toString());
        return headerMap;
    }

    /**
     * 该Header配置用于获取收藏夹信息
     */
    public static HashMap<String, String> getFavListHeaders(String favID) {
        getDanmuHeaders();
        headerMap.put("Accept", "application/json, text/plain, */*");
        headerMap.put("Origin", "https://www.bilibili.com");
        headerMap.put("Referer", new StringBuilder("https://www.bilibili.com/medialist/detail/ml").append(favID).append("?type=2").toString());
        return headerMap;
    }

    /**
     * 设置 Host          为 api.bilibili.com
     * 重写 Cache-Control 为 no-cache
     * 该Header配置用于通用弹幕
     */
    public static HashMap<String, String> getDanmuHeaders() {
        //设置Host 为 “api.bilibili.com”
        getCommonHeaders("api.bilibili.com");
        headerMap.put("Cache-Control", "no-cache");//会覆盖原先的值
        return headerMap;
    }

    /**
     * 请求头中自定义Host
     * 该Header配置用于通用PC端页面访问
     */
    public static HashMap<String, String> getCommonHeaders(String host) {
        getCommonHeaders();//设置共有请求头
        headerMap.put("Host", host);
        return headerMap;
    }

    /**
     * 该Header配置用于通用PC端页面访问
     */
    public static HashMap<String, String> getCommonHeaders() {
        headerMap.clear();//清除之前的头设置
        headerMap.put("Accept", "text/html,application/xhtml+xm…ml;q=0.9,image/webp,*/*;q=0.8");
        headerMap.put("Accept-Encoding", "gzip, deflate, sdch, br");
        headerMap.put("Accept-Language", "zh-CN,zh;q=0.8");
        headerMap.put("Cache-Control", "max-age=0");
        headerMap.put("Connection", "keep-alive");
        headerMap.put("User-Agent", UA_PC_Sogo);
        return headerMap;
    }

}

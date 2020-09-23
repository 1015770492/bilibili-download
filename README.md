爬取指定的bilibili视频

### Api文档请查看项目下的doc文件夹下

环境：jdk14，maven构建

使用方式调用 utils包下的BiliBiliUtils中main方法即可

```java
public static void main(String[] args) {
    String referUrl = "https://www.bilibili.com/video/BV1GT4y1A756?t=284&p=6";//视频页面的播放页面
    BiliBiliUtils.patchDownload(referUrl, "D:/");//将referUrl系列的所有视频存到D:/ 保存的路径
}
```
暂时没有友好的提示，等待程序执行完成结束即可下载完毕


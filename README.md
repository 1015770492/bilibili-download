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
如果遇到http 412错误，说明服务器判断出这是一个爬虫程序，那么恭喜你，浏览器的B站视频也不能播放了！

#### 详细API文档说明
![api文档](./doc/bilibili-Api文档.md)

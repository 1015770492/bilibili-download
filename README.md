爬取指定的bilibili视频

### Api文档请查看项目下的doc文件夹下

环境：jdk14，maven构建

采用vue+ElementUI+springboot做一个简单好看的爬虫项目（后期制作，暂时将主要功能提交）

使用方式调用
```text
使用 top.huashengshu.bilibili.BiliBiliUtils的静态方法

```
下面的referUrl是播放页面的url，将播放页面的url替换成想要下载的url即可
```text
String referUrl = "https://www.bilibili.com/video/BV16K411J754?from=search&seid=7571931833026679506";//测试用的url
BiliBiliUtils.patchDownload(referUrl, "D:/");//将referUrl系列的所有视频存到D:/盘
```

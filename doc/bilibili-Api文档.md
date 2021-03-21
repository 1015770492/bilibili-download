## 第一步、获取cid

#### 传入bvid获取cid

将bvid中的%s替换成对应的bvid

```
http://api.bilibili.com/x/web-interface/view?bvid=%s
```

#### bvid就是图中标记的地方

![BVID的获取方式，复制带BV开头的url即可](https://img-blog.csdnimg.cn/20210322024950455.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQxODEzMjA4,size_16,color_FFFFFF,t_70)

例如请求：http://api.bilibili.com/x/web-interface/view?bvid=BV16K411J754

#### 返回数据的示例：

```json
{
    "code": 0,
    "message": "0",
    "ttl": 1,
    "data": {
        "bvid": "BV16K411J754",
        "aid": 498987201,
        "videos": 25,
        "tid": 122,
        "tname": "野生技术协会",
        "copyright": 1,
        "pic": "http://i1.hdslb.com/bfs/archive/3a3ad05967949f224b9330d930312a62623037a6.jpg",
        "title": "【阿里P7推荐】Redis最新最详细实战合集通俗易懂",
        "pubdate": 1595749328,
        "ctime": 1595749328,
        "desc": "为热爱java学习的爱好者交流，宗旨则为大家提供一个良好的的学习平台，方便大家互相交流了解，欢迎大家多多的加入。望文明交流 团结互助. 有需要更多视频资料的加群：785779447 备注（B站）。",
        "state": 0,
        "attribute": 16512,
        "duration": 41661,
        "mission_id": 13954,
        "rights": {
            "bp": 0,
            "elec": 0,
            "download": 1,
            "movie": 0,
            "pay": 0,
            "hd5": 0,
            "no_reprint": 1,
            "autoplay": 1,
            "ugc_pay": 0,
            "is_cooperation": 0,
            "ugc_pay_preview": 0,
            "no_background": 0
        },
        "owner": {
            "mid": 170141743,
            "name": "图灵架构师诸葛",
            "face": "http://i0.hdslb.com/bfs/face/37638b287e8e1b4a792cd909a38d9dd5d50c408e.jpg"
        },
        "stat": {
            "aid": 498987201,
            "view": 1113,
            "danmaku": 9,
            "reply": 2,
            "favorite": 209,
            "coin": 27,
            "share": 0,
            "now_rank": 0,
            "his_rank": 0,
            "like": 24,
            "dislike": 0,
            "evaluation": ""
        },
        "dynamic": "#知识分享官##阿里##JAVA#",
        "cid": 216773743,
        "dimension": {
            "width": 1920,
            "height": 1080,
            "rotate": 0
        },
        "no_cache": false,
        "pages": [
            {
                "cid": 216773743,
                "page": 1,
                "from": "vupload",
                "part": "1.手动模拟高并发场景秒杀下单超卖Bug",
                "duration": 1722,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216774065,
                "page": 2,
                "from": "vupload",
                "part": "2.秒杀场景下实战JVM级别锁与分布式锁",
                "duration": 1947,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216774231,
                "page": 3,
                "from": "vupload",
                "part": "3.大厂分布式锁Redisson框架实战",
                "duration": 1940,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216774479,
                "page": 4,
                "from": "vupload",
                "part": "4.Redisson使用lua脚本解决锁的原子性问题",
                "duration": 1945,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216774770,
                "page": 5,
                "from": "vupload",
                "part": "5.Redis主从架构锁失效问题及Redlock详解",
                "duration": 1942,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216774996,
                "page": 6,
                "from": "vupload",
                "part": "6.双十一大促如何将分布式锁性能提升100倍",
                "duration": 1940,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216775190,
                "page": 7,
                "from": "vupload",
                "part": "7.从CAP角度剖析Redis&Zookeeper锁架构异同",
                "duration": 1944,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216775516,
                "page": 8,
                "from": "vupload",
                "part": "8. Redis五大核心数据存储结构精讲",
                "duration": 1847,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216775611,
                "page": 9,
                "from": "vupload",
                "part": "9. Redis6.0多线程工作模式解析",
                "duration": 1477,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216775748,
                "page": 10,
                "from": "vupload",
                "part": "10. 如何实现亿级用户日活统计",
                "duration": 1504,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216775836,
                "page": 11,
                "from": "vupload",
                "part": "11. Redis阻塞队列实现原理",
                "duration": 1798,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216775947,
                "page": 12,
                "from": "vupload",
                "part": "12. 如何实现一个高性能的延迟队列",
                "duration": 1481,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216776085,
                "page": 13,
                "from": "vupload",
                "part": "13. Redis ZSet底层跳表实现原理及时间复杂度分析",
                "duration": 1442,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216776382,
                "page": 14,
                "from": "vupload",
                "part": "14.Redis 如何实现持久化",
                "duration": 1859,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216776516,
                "page": 15,
                "from": "vupload",
                "part": "15.面试常问的Redis内存淘汰策略LRU LFU算法",
                "duration": 1779,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216776642,
                "page": 16,
                "from": "vupload",
                "part": "16.Redis 是如何处理过期数据的",
                "duration": 1464,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216776811,
                "page": 17,
                "from": "vupload",
                "part": "17.Redis 多节点数据同步复制原理",
                "duration": 1203,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216776942,
                "page": 18,
                "from": "vupload",
                "part": "18.Redis缓存穿透&缓存雪崩&缓存失效终极解决",
                "duration": 1638,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216773886,
                "page": 19,
                "from": "vupload",
                "part": "19.Redis核心数据结构精讲",
                "duration": 1471,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216777234,
                "page": 20,
                "from": "vupload",
                "part": "20.微博与微信消息流Redis实战",
                "duration": 1551,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216777355,
                "page": 21,
                "from": "vupload",
                "part": "21.微信点赞、收藏与标签基于Redis实战",
                "duration": 1552,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216777563,
                "page": 22,
                "from": "vupload",
                "part": "22.微博与微信朋友关注模型基于Redis实战",
                "duration": 1553,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216777897,
                "page": 23,
                "from": "vupload",
                "part": "23.电商购物车如何用Redis轻松实现",
                "duration": 1554,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216778174,
                "page": 24,
                "from": "vupload",
                "part": "24.电商推荐系统如何用Redis轻松实现",
                "duration": 1554,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            },
            {
                "cid": 216778414,
                "page": 25,
                "from": "vupload",
                "part": "25.Redis深度学习路线指引",
                "duration": 1554,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1920,
                    "height": 1080,
                    "rotate": 0
                }
            }
        ],
        "subtitle": {
            "allow_submit": false,
            "list": []
        }
    }
}
```

### ~~获取视频的标题信息（前面就可以获取）~~

#### 传入cid和bvid进行获取

```
https://api.bilibili.com/x/web-interface/view?cid=%d&bvid=%s
```

替换对应的cid和bvid

例如：

```
https://api.bilibili.com/x/web-interface/view?cid=94678309&bvid=BV1m4411H7pi
```

清晰度

#### 返回的数据示例：

```json
{
    "code": 0,
    "message": "0",
    "ttl": 1,
    "data": {
        "bvid": "BV1m4411H7pi",
        "aid": 54124452,
        "videos": 13,
        "tid": 208,
        "tname": "校园学习",
        "copyright": 2,
        "pic": "http://i2.hdslb.com/bfs/archive/8916702e0ca76de886865a87a5229694e01492c9.jpg",
        "title": "尚硅谷_ElasticSearch",
        "pubdate": 1559308626,
        "ctime": 1559308626,
        "desc": "www.atguigu.com",
        "state": 0,
        "attribute": 16384,
        "duration": 12645,
        "rights": {
            "bp": 0,
            "elec": 0,
            "download": 1,
            "movie": 0,
            "pay": 0,
            "hd5": 0,
            "no_reprint": 0,
            "autoplay": 1,
            "ugc_pay": 0,
            "is_cooperation": 0,
            "ugc_pay_preview": 0,
            "no_background": 0
        },
        "owner": {
            "mid": 166388537,
            "name": "code_ant",
            "face": "http://i0.hdslb.com/bfs/face/3c2ca277fe9d20c2bd325b5957d6e784b1689ab0.jpg"
        },
        "stat": {
            "aid": 54124452,
            "view": 35041,
            "danmaku": 180,
            "reply": 23,
            "favorite": 1353,
            "coin": 25,
            "share": 29,
            "now_rank": 0,
            "his_rank": 0,
            "like": 95,
            "dislike": 0,
            "evaluation": ""
        },
        "dynamic": "#ElasticSearch##java#",
        "cid": 94678309,
        "dimension": {
            "width": 1366,
            "height": 768,
            "rotate": 0
        },
        "no_cache": false,
        "pages": [
            {
                "cid": 94678309,
                "page": 1,
                "from": "vupload",
                "part": "01_es概述",
                "duration": 1569,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1366,
                    "height": 768,
                    "rotate": 0
                }
            },
            {
                "cid": 94679334,
                "page": 2,
                "from": "vupload",
                "part": "02_es核心概念",
                "duration": 751,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1280,
                    "height": 720,
                    "rotate": 0
                }
            },
            {
                "cid": 94679563,
                "page": 3,
                "from": "vupload",
                "part": "03_存入数据和查询数据机制",
                "duration": 536,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1280,
                    "height": 720,
                    "rotate": 0
                }
            },
            {
                "cid": 94679785,
                "page": 4,
                "from": "vupload",
                "part": "04_es安装",
                "duration": 1638,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1280,
                    "height": 720,
                    "rotate": 0
                }
            },
            {
                "cid": 94680691,
                "page": 5,
                "from": "vupload",
                "part": "05_es插件安装",
                "duration": 1503,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1280,
                    "height": 720,
                    "rotate": 0
                }
            },
            {
                "cid": 94681468,
                "page": 6,
                "from": "vupload",
                "part": "06_api环境搭建",
                "duration": 295,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1280,
                    "height": 720,
                    "rotate": 0
                }
            },
            {
                "cid": 94681843,
                "page": 7,
                "from": "vupload",
                "part": "07_获取客户端对象api",
                "duration": 704,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1366,
                    "height": 768,
                    "rotate": 0
                }
            },
            {
                "cid": 94682091,
                "page": 8,
                "from": "vupload",
                "part": "08_创建和删除索引",
                "duration": 574,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1366,
                    "height": 768,
                    "rotate": 0
                }
            },
            {
                "cid": 94682290,
                "page": 9,
                "from": "vupload",
                "part": "09_新建文档",
                "duration": 1427,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1366,
                    "height": 768,
                    "rotate": 0
                }
            },
            {
                "cid": 94682871,
                "page": 10,
                "from": "vupload",
                "part": "10_搜索索引",
                "duration": 786,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1366,
                    "height": 768,
                    "rotate": 0
                }
            },
            {
                "cid": 94683137,
                "page": 11,
                "from": "vupload",
                "part": "11_文档的更新和删除",
                "duration": 985,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1366,
                    "height": 768,
                    "rotate": 0
                }
            },
            {
                "cid": 94683596,
                "page": 12,
                "from": "vupload",
                "part": "12_条件查询",
                "duration": 1360,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1366,
                    "height": 768,
                    "rotate": 0
                }
            },
            {
                "cid": 94684132,
                "page": 13,
                "from": "vupload",
                "part": "13_mapping",
                "duration": 517,
                "vid": "",
                "weblink": "",
                "dimension": {
                    "width": 1366,
                    "height": 768,
                    "rotate": 0
                }
            }
        ],
        "subtitle": {
            "allow_submit": false,
            "list": []
        }
    }
}
```

## 第二步、获取视频的播放 url 以及 清晰度等信息

#### 传入cid和bvid进行获取播放数据的url

qn是清晰度例如：**64**,**32**,**16**

```
https://api.bilibili.com/x/player/playurl?cid=%s&bvid=%s&qn=64&fnver=0&fnval=16&fourk=1
```

示例：https://api.bilibili.com/x/player/playurl?cid=94679563&bvid=BV1m4411H7pi&qn=64&fnver=0&fnval=16&fourk=1



返回的json中的data.dash对象中的video数组和audio数组分表存有视频的播放片段数据和音频播放片段的数据，需要下载下来进行合并成一个视频文件

使用ffmpeg对文件进行合并

命令格式示例：

```bash
ffmpeg -i 下载的视频文件 -i 下载的音频文件 -c copy 合并后的视频文件
```



#### 返回的数据示例：

返回的数据中之所以有多个baseUrl是不同的清晰度，id不同就表示清晰度不同。

同时一个视频有多个地址可以使用，防止一个不能使用了然后就不能播放，因此返回的是多个播放地址，使用的时候只需要用适合的一个即可，音频的链接也一样做了备份，使用其中一个链接下载即可。

注意不可以直接访问下载，因为请求头少了一个参数，后面有说明

```json
{
    "code": 0,
    "message": "0",
    "ttl": 1,
    "data": {
        "from": "local",
        "result": "suee",
        "message": "",
        "quality": 64,
        "format": "flv720",
        "timelength": 535637,
        "accept_format": "flv720,flv480,flv360",
        "accept_description": [
            "高清 720P",
            "清晰 480P",
            "流畅 360P"
        ],
        "accept_quality": [
            64,
            32,
            16
        ],
        "video_codecid": 7,
        "seek_param": "start",
        "seek_type": "offset",
        "dash": {
            "duration": 536,
            "minBufferTime": 1.5,
            "min_buffer_time": 1.5,
            "video": [
                {
                    "id": 64,
                    "baseUrl": "http://upos-sz-mirrorcos.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30064.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=cosbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=60c64e21a2b5b4cfb7582d1178e5bc23&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=0,3&agrr=0&logo=80000000",
                    "base_url": "http://upos-sz-mirrorcos.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30064.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=cosbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=60c64e21a2b5b4cfb7582d1178e5bc23&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=0,3&agrr=0&logo=80000000",
                    "backupUrl": [
                        "http://upos-sz-mirrorcos.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30064.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=cosbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=60c64e21a2b5b4cfb7582d1178e5bc23&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=1,3&agrr=0&logo=40000000",
                        "http://upos-sz-mirrorcosb.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30064.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=cosbbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=251a9c7472536990ba5a59d6828dc5fb&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=2,3&agrr=0&logo=40000000"
                    ],
                    "backup_url": [
                        "http://upos-sz-mirrorcos.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30064.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=cosbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=60c64e21a2b5b4cfb7582d1178e5bc23&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=1,3&agrr=0&logo=40000000",
                        "http://upos-sz-mirrorcosb.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30064.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=cosbbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=251a9c7472536990ba5a59d6828dc5fb&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=2,3&agrr=0&logo=40000000"
                    ],
                    "bandwidth": 479435,
                    "mimeType": "video/mp4",
                    "mime_type": "video/mp4",
                    "codecs": "avc1.64001F",
                    "width": 1280,
                    "height": 720,
                    "frameRate": "16000/1072",
                    "frame_rate": "16000/1072",
                    "sar": "1:1",
                    "startWithSap": 1,
                    "start_with_sap": 1,
                    "SegmentBase": {
                        "Initialization": "0-974",
                        "indexRange": "975-2290"
                    },
                    "segment_base": {
                        "initialization": "0-974",
                        "index_range": "975-2290"
                    },
                    "codecid": 7
                },
                {
                    "id": 64,
                    "baseUrl": "http://upos-sz-mirrorkodo.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30066.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=e36e7f5c6ea20f57587bb391c4789b71&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=0,3&agrr=0&logo=80000000",
                    "base_url": "http://upos-sz-mirrorkodo.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30066.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=e36e7f5c6ea20f57587bb391c4789b71&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=0,3&agrr=0&logo=80000000",
                    "backupUrl": [
                        "http://upos-sz-mirrorkodo.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30066.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=e36e7f5c6ea20f57587bb391c4789b71&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=1,3&agrr=0&logo=40000000",
                        "http://upos-sz-mirrorkodob.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30066.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=a6242437e0eb2908c10479c91c5f14ec&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=2,3&agrr=0&logo=40000000"
                    ],
                    "backup_url": [
                        "http://upos-sz-mirrorkodo.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30066.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=e36e7f5c6ea20f57587bb391c4789b71&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=1,3&agrr=0&logo=40000000",
                        "http://upos-sz-mirrorkodob.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30066.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=a6242437e0eb2908c10479c91c5f14ec&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=2,3&agrr=0&logo=40000000"
                    ],
                    "bandwidth": 328110,
                    "mimeType": "video/mp4",
                    "mime_type": "video/mp4",
                    "codecs": "hev1.1.6.L120.90",
                    "width": 1280,
                    "height": 720,
                    "frameRate": "16000/1056",
                    "frame_rate": "16000/1056",
                    "sar": "1:1",
                    "startWithSap": 1,
                    "start_with_sap": 1,
                    "SegmentBase": {
                        "Initialization": "0-1155",
                        "indexRange": "1156-2471"
                    },
                    "segment_base": {
                        "initialization": "0-1155",
                        "index_range": "1156-2471"
                    },
                    "codecid": 12
                },
                {
                    "id": 32,
                    "baseUrl": "http://upos-sz-mirrorhw.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30032.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=hwbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=8d27f992d439c797ea6d3bc24454ce34&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=0,3&agrr=0&logo=80000000",
                    "base_url": "http://upos-sz-mirrorhw.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30032.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=hwbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=8d27f992d439c797ea6d3bc24454ce34&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=0,3&agrr=0&logo=80000000",
                    "backupUrl": [
                        "http://upos-sz-mirrorhw.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30032.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=hwbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=8d27f992d439c797ea6d3bc24454ce34&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=1,3&agrr=0&logo=40000000",
                        "http://upos-sz-mirrorhwb.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30032.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=hwbbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=04e1a7bd737b1a78bbb6cf55bea556d8&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=2,3&agrr=0&logo=40000000"
                    ],
                    "backup_url": [
                        "http://upos-sz-mirrorhw.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30032.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=hwbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=8d27f992d439c797ea6d3bc24454ce34&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=1,3&agrr=0&logo=40000000",
                        "http://upos-sz-mirrorhwb.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30032.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=hwbbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=04e1a7bd737b1a78bbb6cf55bea556d8&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=2,3&agrr=0&logo=40000000"
                    ],
                    "bandwidth": 298700,
                    "mimeType": "video/mp4",
                    "mime_type": "video/mp4",
                    "codecs": "avc1.64001E",
                    "width": 852,
                    "height": 480,
                    "frameRate": "16000/1072",
                    "frame_rate": "16000/1072",
                    "sar": "1:1",
                    "startWithSap": 1,
                    "start_with_sap": 1,
                    "SegmentBase": {
                        "Initialization": "0-974",
                        "indexRange": "975-2290"
                    },
                    "segment_base": {
                        "initialization": "0-974",
                        "index_range": "975-2290"
                    },
                    "codecid": 7
                },
                {
                    "id": 32,
                    "baseUrl": "http://upos-sz-mirrorhw.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30033.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=hwbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=372d56ce7d359ffa61200638eec3860f&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=0,3&agrr=0&logo=80000000",
                    "base_url": "http://upos-sz-mirrorhw.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30033.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=hwbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=372d56ce7d359ffa61200638eec3860f&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=0,3&agrr=0&logo=80000000",
                    "backupUrl": [
                        "http://upos-sz-mirrorhw.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30033.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=hwbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=372d56ce7d359ffa61200638eec3860f&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=1,3&agrr=0&logo=40000000",
                        "http://upos-sz-mirrorhwb.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30033.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=hwbbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=a3db1a94557bfac6a625669a289d51ca&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=2,3&agrr=0&logo=40000000"
                    ],
                    "backup_url": [
                        "http://upos-sz-mirrorhw.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30033.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=hwbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=372d56ce7d359ffa61200638eec3860f&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=1,3&agrr=0&logo=40000000",
                        "http://upos-sz-mirrorhwb.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30033.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=hwbbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=a3db1a94557bfac6a625669a289d51ca&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=2,3&agrr=0&logo=40000000"
                    ],
                    "bandwidth": 203455,
                    "mimeType": "video/mp4",
                    "mime_type": "video/mp4",
                    "codecs": "hev1.1.6.L120.90",
                    "width": 852,
                    "height": 480,
                    "frameRate": "16000/1056",
                    "frame_rate": "16000/1056",
                    "sar": "1:1",
                    "startWithSap": 1,
                    "start_with_sap": 1,
                    "SegmentBase": {
                        "Initialization": "0-1155",
                        "indexRange": "1156-2471"
                    },
                    "segment_base": {
                        "initialization": "0-1155",
                        "index_range": "1156-2471"
                    },
                    "codecid": 12
                },
                {
                    "id": 16,
                    "baseUrl": "http://upos-sz-mirrorkodo.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30015.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=6c657f6382f5bbd73c3c2b80a953976d&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=0,3&agrr=0&logo=80000000",
                    "base_url": "http://upos-sz-mirrorkodo.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30015.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=6c657f6382f5bbd73c3c2b80a953976d&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=0,3&agrr=0&logo=80000000",
                    "backupUrl": [
                        "http://upos-sz-mirrorkodo.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30015.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=6c657f6382f5bbd73c3c2b80a953976d&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=1,3&agrr=0&logo=40000000",
                        "http://upos-sz-mirrorkodob.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30015.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=846b34bf31cacd61d0988c071ba5d111&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=2,3&agrr=0&logo=40000000"
                    ],
                    "backup_url": [
                        "http://upos-sz-mirrorkodo.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30015.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=6c657f6382f5bbd73c3c2b80a953976d&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=1,3&agrr=0&logo=40000000",
                        "http://upos-sz-mirrorkodob.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30015.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=846b34bf31cacd61d0988c071ba5d111&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=2,3&agrr=0&logo=40000000"
                    ],
                    "bandwidth": 192871,
                    "mimeType": "video/mp4",
                    "mime_type": "video/mp4",
                    "codecs": "avc1.64001E",
                    "width": 640,
                    "height": 360,
                    "frameRate": "16000/1072",
                    "frame_rate": "16000/1072",
                    "sar": "1:1",
                    "startWithSap": 1,
                    "start_with_sap": 1,
                    "SegmentBase": {
                        "Initialization": "0-974",
                        "indexRange": "975-2290"
                    },
                    "segment_base": {
                        "initialization": "0-974",
                        "index_range": "975-2290"
                    },
                    "codecid": 7
                },
                {
                    "id": 16,
                    "baseUrl": "http://upos-sz-mirrorkodo.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30011.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=a893e6d960cf364036635279cd91c83c&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=0,3&agrr=0&logo=80000000",
                    "base_url": "http://upos-sz-mirrorkodo.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30011.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=a893e6d960cf364036635279cd91c83c&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=0,3&agrr=0&logo=80000000",
                    "backupUrl": [
                        "http://upos-sz-mirrorkodo.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30011.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=a893e6d960cf364036635279cd91c83c&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=1,3&agrr=0&logo=40000000",
                        "http://upos-sz-mirrorkodob.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30011.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=fd345a685d1bc9c2f2099931b83a0759&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=2,3&agrr=0&logo=40000000"
                    ],
                    "backup_url": [
                        "http://upos-sz-mirrorkodo.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30011.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=a893e6d960cf364036635279cd91c83c&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=1,3&agrr=0&logo=40000000",
                        "http://upos-sz-mirrorkodob.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30011.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=fd345a685d1bc9c2f2099931b83a0759&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=2,3&agrr=0&logo=40000000"
                    ],
                    "bandwidth": 167969,
                    "mimeType": "video/mp4",
                    "mime_type": "video/mp4",
                    "codecs": "hev1.1.6.L120.90",
                    "width": 640,
                    "height": 360,
                    "frameRate": "16000/1056",
                    "frame_rate": "16000/1056",
                    "sar": "1:1",
                    "startWithSap": 1,
                    "start_with_sap": 1,
                    "SegmentBase": {
                        "Initialization": "0-1155",
                        "indexRange": "1156-2471"
                    },
                    "segment_base": {
                        "initialization": "0-1155",
                        "index_range": "1156-2471"
                    },
                    "codecid": 12
                }
            ],
            "audio": [
                {
                    "id": 30280,
                    "baseUrl": "http://upos-sz-mirrorcos.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30280.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=cosbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=b23a377f3e0088d7082c2e2f6e793d0b&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=0,3&agrr=0&logo=80000000",
                    "base_url": "http://upos-sz-mirrorcos.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30280.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=cosbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=b23a377f3e0088d7082c2e2f6e793d0b&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=0,3&agrr=0&logo=80000000",
                    "backupUrl": [
                        "http://upos-sz-mirrorcos.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30280.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=cosbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=b23a377f3e0088d7082c2e2f6e793d0b&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=1,3&agrr=0&logo=40000000",
                        "http://upos-sz-mirrorcosb.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30280.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=cosbbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=6e10b8b814f7744edda4d7c144b19e29&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=2,3&agrr=0&logo=40000000"
                    ],
                    "backup_url": [
                        "http://upos-sz-mirrorcos.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30280.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=cosbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=b23a377f3e0088d7082c2e2f6e793d0b&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=1,3&agrr=0&logo=40000000",
                        "http://upos-sz-mirrorcosb.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30280.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=cosbbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=6e10b8b814f7744edda4d7c144b19e29&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=2,3&agrr=0&logo=40000000"
                    ],
                    "bandwidth": 132489,
                    "mimeType": "audio/mp4",
                    "mime_type": "audio/mp4",
                    "codecs": "mp4a.40.2",
                    "width": 0,
                    "height": 0,
                    "frameRate": "",
                    "frame_rate": "",
                    "sar": "",
                    "startWithSap": 0,
                    "start_with_sap": 0,
                    "SegmentBase": {
                        "Initialization": "0-907",
                        "indexRange": "908-2235"
                    },
                    "segment_base": {
                        "initialization": "0-907",
                        "index_range": "908-2235"
                    },
                    "codecid": 0
                },
                {
                    "id": 30216,
                    "baseUrl": "http://upos-sz-mirrorkodo.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30216.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=ee708af43b9536dc55fd6245cd903e4b&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=0,3&agrr=0&logo=80000000",
                    "base_url": "http://upos-sz-mirrorkodo.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30216.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=ee708af43b9536dc55fd6245cd903e4b&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=0,3&agrr=0&logo=80000000",
                    "backupUrl": [
                        "http://upos-sz-mirrorkodo.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30216.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=ee708af43b9536dc55fd6245cd903e4b&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=1,3&agrr=0&logo=40000000",
                        "http://upos-sz-mirrorkodob.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30216.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=902fc2b9a010340900d5554fcb1c30f5&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=2,3&agrr=0&logo=40000000"
                    ],
                    "backup_url": [
                        "http://upos-sz-mirrorkodo.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30216.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=ee708af43b9536dc55fd6245cd903e4b&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=1,3&agrr=0&logo=40000000",
                        "http://upos-sz-mirrorkodob.bilivideo.com/upgcxcode/63/95/94679563/94679563-1-30216.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1596651706&gen=playurl&os=kodobbv&oi=1993628872&trid=5b291333e5e740829ca69810b5df7b8fu&platform=pc&upsig=902fc2b9a010340900d5554fcb1c30f5&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&mid=396030917&orderid=2,3&agrr=0&logo=40000000"
                    ],
                    "bandwidth": 66414,
                    "mimeType": "audio/mp4",
                    "mime_type": "audio/mp4",
                    "codecs": "mp4a.40.2",
                    "width": 0,
                    "height": 0,
                    "frameRate": "",
                    "frame_rate": "",
                    "sar": "",
                    "startWithSap": 0,
                    "start_with_sap": 0,
                    "SegmentBase": {
                        "Initialization": "0-907",
                        "indexRange": "908-2235"
                    },
                    "segment_base": {
                        "initialization": "0-907",
                        "index_range": "908-2235"
                    },
                    "codecid": 0
                }
            ]
        }
    }
}
```

## 第三步、真正下载视频和音频数据



#### 注意点：再上面一个请求获取到baseUrl后需要在请求头上加入参数referer值是原地址，也就是https://www.bilibili.com/video/ + bvid

请求头需要带上原视频的链接才能获取视频数据 下面的%s就是bvid 也就是BV开头的一串字符

```bash
Referer=https://www.bilibili.com/video/%s
```

例如：请求头加上      Referer=https://www.bilibili.com/video/BV1m4411H7pi

在第二步的基础上，请求路径就是获取到的baseUrl，请求头中需要加上上面的参数，注意修改

## 第四步、合并视频和音频文件

通过第三方工具进行合并

工具下载页面：https://ffmpeg.org/download.html

选择对应操作系统的文件

例如windows系统，

![ffmpeg.exe](https://img-blog.csdnimg.cn/20210322024839559.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQxODEzMjA4,size_16,color_FFFFFF,t_70)



****

工具的使用方式是

```
ffmpeg -i 下载的视频文件 -i 下载的音频文件 -c copy 合并后的视频文件
```



## 其它Api

### 获取作者详细详情

#### 传入aid获取

```bash
https://api.bilibili.com/x/web-interface/view/detail?aid=%s
```

示例：https://api.bilibili.com/x/web-interface/view/detail?aid=54124452

示例略。




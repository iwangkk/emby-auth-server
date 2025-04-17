# emby-auth-server
一个简单的emby激活服务接口，可以基于docker运行


## 本地构建打包镜像步骤

下载代码后，到项目根目录，执行如下命令

```xml
mvn package

docker build -t emby-auth-server:0.0.1 .  

docker run -d -p 8081:8081 emby-auth-server:0.0.1
```


## 包含接口



| 接口                                       | 响应参数                                                     | 描述                 |
| ------------------------------------------ | ------------------------------------------------------------ | :------------------- |
| /admin/service/registration/validateDevice | {"cacheExpirationDays": 3650,"message": "Device Valid","resultCode": "GOOD"} | 验证设备缓存过期时间 |
| /admin/service/registration/validate       | {"featId":"","registered":true,"expDate":"2099-01-01","key":""} | 验证过期时间         |
| /admin/service/registration/getStatus      | {"deviceStatus":"","planType":"Lifetime","subscriptions":{}} | 获取状态             |
| /admin/service/appstore/register           | {"featId": "","registered": true,"expDate": "2099-01-01","key": ""} | 获取应用市场注册状态 |
| /emby/Plugins/SecurityInfo                 | {SupporterKey: "", IsMBSupporter: true}                      |                      |



## 关于快速部署



你也可以去直接使用我打好包的镜像直接运行即可






关联链接：

https://blog.peos.cn/2024/11/23/emby.html

https://blog.jiawei.xin/?p=469


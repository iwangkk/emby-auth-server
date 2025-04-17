package com.emby.auth.embyauthserver;

import com.alibaba.fastjson.JSONObject;
import jdk.nashorn.api.scripting.JSObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author 王可可
 * @create 2025/4/17 13:47Ø
 * @ClassName AuthController
 * @Description
 */
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class AuthController {

    /**
     * 验证设备缓存过期时间
     * @return
     */
    @GetMapping(value = "/admin/service/registration/validateDevice")
    public JSONObject validateDevice() {
        String jsonString ="{\"cacheExpirationDays\":3650,\"message\":\"Device Valid\",\"resultCode\":\"GOOD\"}";
        return JSONObject.parseObject(jsonString);
    }

    /**
     * 验证过期时间
     * @return
     */
    @GetMapping(value = "/admin/service/registration/validate")
    public JSONObject validate() {
        String jsonString ="{\"featId\":\"\",\"registered\":true,\"expDate\":\"2099-01-01\",\"key\":\"\"}";
        return JSONObject.parseObject(jsonString);
    }

    /**
     * 获取状态
     * @return
     */
    @GetMapping(value = "/admin/service/registration/getStatus")
    public JSONObject getStatus() {
        String jsonString ="{\"deviceStatus\":\"0\",\"planType\":\"Lifetime\",\"subscriptions\":{}}";
        return JSONObject.parseObject(jsonString);
    }

    /**
     * 获取应用市场注册状态
     * @return
     */
    @GetMapping(value = "/admin/service/appstore/register")
    public JSONObject register() {
        String jsonString ="{\"featId\": \"\",\"registered\": true,\"expDate\": \"2099-01-01\",\"key\": \"\"}";
        return JSONObject.parseObject(jsonString);
    }

    @GetMapping(value = "/emby/Plugins/SecurityInfo")
    public JSONObject securityInfo() {
        String jsonString ="{\"SupporterKey\":\"\",\"IsMBSupporter\":true}";
        return JSONObject.parseObject(jsonString);
    }
}

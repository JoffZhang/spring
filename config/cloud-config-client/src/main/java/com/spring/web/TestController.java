package com.spring.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : ZhangYun
 * @Description :
 * @Date :  2017/5/8.
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${from}")   //@Value("${from}")绑定配置服务中配置的from属性。
    private String from;

    @RequestMapping("/from")
    public String from(){
        return this.from;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }


}

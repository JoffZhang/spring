package com.spring.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author : ZhangYun
 * @Description :使用@FeignClient("compute-service")注解来绑定该接口对应compute-service服务
通过Spring MVC的注解来配置compute-service服务下的具体实现。
 * @Date :  2017/5/5.
 */
@FeignClient("compute-service")
public interface ComputeClient {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}

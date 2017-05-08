package com.spring.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author : ZhangYun
 * @Description :
 * @Date :  2017/5/5.
 */
@Service
public class ComputeService {
    @Autowired
    RestTemplate restTemplate;
//新增ComputeService类，在使用ribbon消费服务的函数上增加@HystrixCommand注解来指定回调方法
    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService(){
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=21",String.class).getBody();
    }
    public String addServiceFallback(){
        return "error";
    }
}

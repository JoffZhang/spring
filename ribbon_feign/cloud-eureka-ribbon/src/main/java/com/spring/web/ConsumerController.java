package com.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author : ZhangYun
 * @Description :
 * @Date :  2017/5/4.
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20",String.class).getBody();
    }
}

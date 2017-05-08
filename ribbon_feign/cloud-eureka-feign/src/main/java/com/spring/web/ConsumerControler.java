package com.spring.web;

import com.spring.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : ZhangYun
 * @Description :
 * @Date :  2017/5/5.
 */
@RestController
public class ConsumerControler {

    @Autowired
    ComputeClient conputeClient;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public Integer add(){
        return conputeClient.add(19,11);
    }
}

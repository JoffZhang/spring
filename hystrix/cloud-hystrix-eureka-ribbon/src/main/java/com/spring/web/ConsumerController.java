package com.spring.web;

import com.spring.service.ComputeService;
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
public class ConsumerController {

    @Autowired
    private ComputeService computeService;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
        return computeService.addService();
    }
}

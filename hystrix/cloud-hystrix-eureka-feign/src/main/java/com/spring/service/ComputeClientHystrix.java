package com.spring.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author : ZhangYun
 * @Description :创建回调类ComputeClientHystrix，实现@FeignClient的接口，此时实现的方法就是对应@FeignClient接口中映射的fallback函数
 * @Date :  2017/5/5.
 */
@Component
public class ComputeClientHystrix implements ComputeClient {
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}

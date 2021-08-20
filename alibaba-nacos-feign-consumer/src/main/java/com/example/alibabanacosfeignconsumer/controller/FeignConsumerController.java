package com.example.alibabanacosfeignconsumer.controller;

import com.example.alibabanacosfeignconsumer.api.FeignConsumerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author Administrator
 * @date 2021/8/20
 */
@RestController
public class FeignConsumerController {

    @Autowired
    FeignConsumerApi feignConsumerApi;

    @RequestMapping("/feign/test")
    public String test(String name){
        String str = feignConsumerApi.test(name+" from feign");
        return str;
    }

}

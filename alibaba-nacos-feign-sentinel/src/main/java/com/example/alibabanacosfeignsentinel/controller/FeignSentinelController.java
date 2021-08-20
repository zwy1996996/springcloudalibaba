package com.example.alibabanacosfeignsentinel.controller;

import com.example.alibabanacosfeignsentinel.api.FeignSentinelApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author Administrator
 * @date 2021/8/20
 */

@RestController
public class FeignSentinelController {

    @Resource
    FeignSentinelApi feignSentinelApi;

    @RequestMapping("/feignSentinel/test")
    public String test(String name){
        String str = feignSentinelApi.test(name+" from fegin+sentinel");
        return  str;
    }
}

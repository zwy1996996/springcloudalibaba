package com.example.alibabanacosgateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * TODO
 *
 * @author Administrator
 * @date 2021/8/20
 */
@RequestMapping
public class NacosGatewayController {

    @RequestMapping("/nacos/test")
    //@RequestParam("name") 为了防止调用远程接口时对方接收不到参数
    public String test(@RequestParam("name") String name){
        return "welcome nacos gateway";
    }
}

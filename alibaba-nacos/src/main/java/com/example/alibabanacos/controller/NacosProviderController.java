package com.example.alibabanacos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author Administrator
 * @date 2021/8/20
 */
@RestController
public class NacosProviderController {

    @RequestMapping("/nacos/test")
    //@RequestParam("name")是为防止fegin远程调用是接收不到参数
    public String test(@RequestParam("name") String name){
        return "hello "+name;
    }
}

package com.example.eurekaserviceb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author Administrator
 * @date 2021/8/17
 */
@RequestMapping("/user")
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("端口:8092正在执行");
        return "8092";
    }



}

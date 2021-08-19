package com.example.eurekaservicea.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author Administrator
 * @date 2021/8/17
 */
@RestController
@RequestMapping("/user")
public class GateWayTestController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("端口号：8093正在执行");
        return "8093";
    }
}

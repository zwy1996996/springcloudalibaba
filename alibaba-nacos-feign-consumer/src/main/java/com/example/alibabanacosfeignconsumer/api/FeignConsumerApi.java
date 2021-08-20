package com.example.alibabanacosfeignconsumer.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "nacos-provide")//调用的微服务名称spring:application:name: nacos-provide
public interface FeignConsumerApi {

    @RequestMapping("/nacos/test")
    //@RequestParam("name") 为了防止调用远程接口时对方接收不到参数
    public String test(@RequestParam("name") String name);
}

package com.example.feign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="EUREKA-SERVICE")//远程调用的服务明
public interface Client {

    @RequestMapping("/user/test")
    public String test();

}

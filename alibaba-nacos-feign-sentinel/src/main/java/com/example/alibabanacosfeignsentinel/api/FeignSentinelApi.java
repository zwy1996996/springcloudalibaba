package com.example.alibabanacosfeignsentinel.api;

import com.example.alibabanacosfeignsentinel.api.fallback.FeignSentinelApiImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="nacos-provide",fallback = FeignSentinelApiImpl.class)
public interface FeignSentinelApi {

    @RequestMapping("/nacos/test")
    //@RequestParam("name") 为了防止调用远程接口时对方接收不到参数
    public String test(@RequestParam("name") String name);

}

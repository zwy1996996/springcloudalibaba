package com.example.alibabanacosfeignsentinelcontro.controller;

import com.example.alibabanacosfeignsentinelcontro.api.FeignSentinelControApi;
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
    FeignSentinelControApi feignSentinelControApi;

    @RequestMapping("/feignSentinelContro/test")
    public String test(String name){
        String str = feignSentinelControApi.test(name+" from fegin+sentinel+contro");
        return  str;
    }


}

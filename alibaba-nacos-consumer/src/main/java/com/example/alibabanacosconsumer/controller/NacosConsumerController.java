package com.example.alibabanacosconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * TODO
 *
 * @author Administrator
 * @date 2021/8/20
 */
@RestController
public class NacosConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/nacosConsummer/test")
    public String test(){
        String str = "";
        //如果开发者需要获取响应头的话，那么就需要使用 getForEntity 来发送 HTTP 请求，此时返回的对象是一个 ResponseEntity 的实例
        //传递参数方法一
        // ResponseEntity<String> forEntity =  restTemplate.getForEntity("http://localhost:8041/nacos/test？xx={name}", String.class，name);
        //第一个参数是 url ，url 中有一个占位符 {1} ,如果有多个占位符分别用 {2} 、 {3} … 去表示，第二个参数是接口返回的数据类型，最后是一个可变长度的参数，用来给占位符填值。
        //传递参数方法二
        //参数放入到一个 map 中,map 中的 key 和占位符的 key 相对应，map 中的 value 就是参数的具体值，例如还是上面的请求，利用 map 来传递参数
        //ResponseEntity<String> forEntity =  restTemplate.getForEntity("http://localhost:8041/nacos/test", String.class,map);
        //传递参数方法三
        //传递uri对象
        //ResponseEntity<String> forEntity =  restTemplate.getForEntity(URI.create("http://localhost:8041/nacos/test"), String.class);
        //返回的 ResponseEntity 中，可以获取响应头中的信息，其中 getStatusCode 方法用来获取响应状态码， getBody 方法用来获取响应数据， getHeaders 方法用来获取响应头
        ResponseEntity<String> forEntity =  restTemplate.getForEntity("http://localhost:8041/nacos/test?name={1}", String.class,"zwy");
        //使用 getForObject 无法获取到响应头
        //postForEntity，postForObject,postForLocation（返回url），put（无返回值），delete（无返回值），
        // 可以通过拦截器的exchange把cookie传递给调用接口使用，setInterceptors（拦截器），exchange（通用方法）


        str = forEntity.toString();
        return str;
    }
}

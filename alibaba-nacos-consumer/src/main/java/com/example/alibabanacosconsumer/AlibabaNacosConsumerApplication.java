package com.example.alibabanacosconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaNacosConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosConsumerApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {//需要
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }

}

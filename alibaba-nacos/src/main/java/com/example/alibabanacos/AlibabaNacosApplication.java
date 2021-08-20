package com.example.alibabanacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosApplication.class, args);
    }

}

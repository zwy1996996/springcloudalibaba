package com.example.alibabanacosgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaNacosGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosGatewayApplication.class, args);
    }

}

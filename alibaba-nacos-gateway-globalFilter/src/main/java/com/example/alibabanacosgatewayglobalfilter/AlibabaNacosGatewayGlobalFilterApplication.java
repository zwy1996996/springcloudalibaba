package com.example.alibabanacosgatewayglobalfilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaNacosGatewayGlobalFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosGatewayGlobalFilterApplication.class, args);
    }

}

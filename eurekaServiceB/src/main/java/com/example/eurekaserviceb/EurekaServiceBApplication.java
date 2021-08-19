package com.example.eurekaserviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServiceBApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceBApplication.class, args);
    }

}

package com.example.ribbo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class RibboApplicationTests {

    @Autowired
    RestTemplate restTemplate;


    @Test
    void testRibbon() {
        /**
         * 使用添加@LoadBalanced注解后的RestTemplate调用服务提供者的接口时，可以使用虚拟IP替代真实IP地址。
         * 所谓的虚拟IP就是服务提供者在application.properties或yml文件中配置的spring.application.name属性的值
         */
        String serviceId = "EUREKASERVICE";//
        for (int i=0;i<10;i++){
            //ribbon客户端从eurekaServer中获取服务列表,根据服务名获取服务列表
            ResponseEntity<String> forEntity = restTemplate.getForEntity("http://"+serviceId+"/user/test", String.class);
            String body = forEntity.getBody();
            System.out.println(body);
        }
    }

}

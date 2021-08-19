package com.example.feign;

import com.example.feign.api.Client;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FeignApplicationTests {

    @Autowired
    Client client;

    @Test
    void test() {
        for (int i = 0; i < 20; i++) {
            String s = client.test();
            System.out.println(s);
        }

    }

}

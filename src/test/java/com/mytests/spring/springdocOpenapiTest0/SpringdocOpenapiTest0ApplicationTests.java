package com.mytests.spring.springdocOpenapiTest0;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
class SpringdocOpenapiTest0ApplicationTests {
@Autowired
    WebApplicationContext ctx;
    @Test
    void contextLoads() {
        for (String name : ctx.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }

}

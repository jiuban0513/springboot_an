package com.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot1HelloworldApplicationTests {
    //自定义属性配置
    @Value("${an.custom.configuration}")
    private String an;

    @Test
    public void contextLoads() {
        System.out.println(this.an);
    }

}

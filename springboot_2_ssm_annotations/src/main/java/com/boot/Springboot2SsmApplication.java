package com.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//此注解表示SpringBoot启动类
@SpringBootApplication
// 此注解表示动态扫描DAO接口所在包，实际上不加下面这条语句也可以找到//mapper 包扫描
@MapperScan("com.boot.mapper")
public class Springboot2SsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2SsmApplication.class, args);
    }

}

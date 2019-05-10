package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})//禁用springboot默认加载数据源配置
public class Springboot3SsmMultipleDataSource1Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot3SsmMultipleDataSource1Application.class, args);
    }

}

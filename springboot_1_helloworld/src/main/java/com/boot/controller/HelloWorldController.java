package com.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@PostMapping(value = "/")
//@GetMapping(value = "/")
@RequestMapping(value = "/")
public class HelloWorldController {

    //自定义属性配置
    @Value("${an.custom.configuration}")
    private String an;

    @RequestMapping(value = "/")
    public String helloworld(){
        return "Hello World! SpringBoot2.0!"+"      "+this.an;
    }
}

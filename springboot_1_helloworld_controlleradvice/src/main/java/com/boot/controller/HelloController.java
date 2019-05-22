package com.boot.controller;

import com.boot.exception.MyBusinessException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HelloController {

    @RequestMapping(value = "/")
    public String index(){
        int num = 1/0;
        return "成功";
    }

    @RequestMapping(value = "/custom")
    public String index2(){
        throw new MyBusinessException("100","密码错误！");
    }

}

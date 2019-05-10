package com.boot.controller;

import com.boot.entity.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/")
public class UserController {

    @RequestMapping(value = "/getUser")
//    @Cacheable(value = "user-key")//value 的值就是缓存到 Redis 中的 key
    @Cacheable(value = "com.neox")
    public User getUser(){
        User user=new User("aa@126.com", "aa", "aa123456", "aa","123");
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }

    @RequestMapping(value = "/user")
    public List user(){
        List<Object> objects = new ArrayList<>();
        User user1 = new User("an@qq.com", "an", "123456", "tu","20");
        User user2 = new User("er@qq.com", "er", "123456", "tuz","21");
        objects.add(user1);
        objects.add(user2);
        return objects;
    }

}

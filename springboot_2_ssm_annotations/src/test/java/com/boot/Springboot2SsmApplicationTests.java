package com.boot;

import com.boot.entity.User;
import com.boot.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot2SsmApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        User user = new User("xiaoming","123456",(byte)2,new Date(),new Date());
        Integer insert = userMapper.insert(user);
        System.out.println(insert);
    }

}

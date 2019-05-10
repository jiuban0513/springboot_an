package com.boot;

import com.boot.entity.User;
import com.boot.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot2SsmXmlApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert(){
        User user = new User("xml","123456",(byte)1,new Date(),new Date());
        Integer insert = userMapper.insert(user);
        System.out.println(insert);
    }

    @Test
    public void deleteuser(){
        Integer deleteuser = userMapper.deleteuser(6);
        System.out.println(deleteuser);
    }

    @Test
    public void update(){
        User user = new User();
        user.setId(6);
        user.setUsername("new");
        user.setSex((byte)2);
        Integer update = userMapper.update(user);
        System.out.println(update);
    }

    @Test
    public void selectuserByid(){
        User user = userMapper.selectuserByid(6);
        System.out.println(user.toString());
    }

    @Test
    public void selectuser(){
        List<User> selectuser = userMapper.selectuser();
        System.out.println(selectuser.toString());
    }

    @Test
    public void contextLoads() {
    }

}

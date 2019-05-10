package com.boot.user;

import com.boot.entity.User;
import com.boot.service.IUserService;
import com.mongodb.client.result.DeleteResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private IUserService userServiceImpl;

    @Test
    public void insertUser(){
        User user = new User();
        user.setId((long)2);
        user.setUsername("uzi");
        user.setPassword("rng");
        User user1 = userServiceImpl.insertUser(user);
        System.out.println(user);
    }

    @Test
    public void deleteUser(){
        DeleteResult deleteResult = userServiceImpl.deleteUser((long) 1);
        System.out.println(deleteResult);
    }

    @Test
    public void updateUser(){
        User user = new User();
        user.setId((long)1);
        user.setUsername("ming");
        long l = userServiceImpl.updateUser(user);
        System.out.println(l);
    }

    @Test
    public void selectUser(){
        User uzi = userServiceImpl.selectUserByUsername("uzi");
        System.out.println(uzi);
    }

}

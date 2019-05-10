package com.boot.service.impl;

import com.boot.entity.User;
import com.boot.mapper.UserMapper;
import com.boot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer adduser(String username, String password) {
        byte sex = 1;//1-男，2-女（默认男）
        Date createtime = new Date();
        Date lasttime = new Date();
        User user = new User(username, password, sex, createtime, lasttime);
        Integer adduser = userMapper.insert(user);
        return adduser;
    }

    @Override
    public Integer deleteuser(long id) {
        Integer deleteuser = userMapper.deleteuser(id);
        return deleteuser;
    }

    @Override
    public Integer updateuser(long id,String username, String password, byte sex, Date createtime, Date lasttime) {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);
        user.setSex(sex);
        user.setCreatetime(createtime);
        user.setLasttime(lasttime);
        Integer updateuser = userMapper.update(user);
        return updateuser;
    }

    @Override
    public User selectuserByid(long id) {
        User user = userMapper.selectuserByid(id);
        return user;
    }

    @Override
    public List<User> selectuser() {
        List<User> selectuser = userMapper.selectuser();
        return selectuser;
    }
}

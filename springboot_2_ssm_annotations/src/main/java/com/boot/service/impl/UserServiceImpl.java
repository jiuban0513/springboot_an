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
        Integer adduser = userMapper.adduser(username, password, sex, createtime, lasttime);
        return adduser;
    }

    @Override
    public Integer deleteuser(long id) {
        Integer deleteuser = userMapper.deleteuser(id);
        return deleteuser;
    }

    @Override
    public Integer updateuser(long id,String username, String password, byte sex, Date createtime, Date lasttime) {
        Integer updateuser = userMapper.updateuser(id, username, password, sex, createtime, lasttime);
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

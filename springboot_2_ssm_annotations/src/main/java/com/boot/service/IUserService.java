package com.boot.service;

import com.boot.entity.User;

import java.util.Date;
import java.util.List;

public interface IUserService {

    Integer adduser(String username,String password);

    Integer deleteuser(long id);

    Integer updateuser(long id,String username, String password, byte sex, Date createtime,Date lasttime);

    User selectuserByid(long id);

    List<User> selectuser();


}

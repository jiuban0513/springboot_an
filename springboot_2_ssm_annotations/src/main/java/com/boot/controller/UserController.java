package com.boot.controller;

import com.boot.entity.User;
import com.boot.service.IUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(method = RequestMethod.POST,value = "/")
public class UserController {

    @Autowired
    private IUserService userServiceImpl;

    @RequestMapping(value = "/adduser")
    public String adduser(@RequestParam(value = "username")String username,
                          @RequestParam(value = "password")String password){
        Integer adduser = userServiceImpl.adduser(username, password);
        return adduser.toString();
    }

    @RequestMapping(value = "/deleteuser")
    public String deleteuser(@RequestParam()long id){
        Integer deleteuser = userServiceImpl.deleteuser(id);
        return deleteuser.toString();
    }

    @RequestMapping(value = "/updateuser")
    public String adduser(@RequestParam(value = "id")long id,
                          @RequestParam(value = "username",required = false)String username,
                          @RequestParam(value = "password",required = false)String password,
                          @RequestParam(value = "sex",required = false)byte sex,
                          @RequestParam(value = "createtime",required = false) Date createtime){
        Date lasttime = new Date();
        Integer updateuser = userServiceImpl.updateuser(id, username, password, sex, createtime, lasttime);
        return updateuser.toString();
    }

    @RequestMapping(value = "/selectuserByid")
    public String selectuserByid(@RequestParam(value = "id")long id){
        User user = userServiceImpl.selectuserByid(id);
        return user.toString();
    }

    @RequestMapping(value = "/selectuser")
    public String selectuser(){
        List<User> selectuser = userServiceImpl.selectuser();
        return selectuser.toString();
    }



}

package com.boot.mapper;

import com.boot.entity.User;
import org.apache.ibatis.annotations.*;
import org.mybatis.spring.annotation.MapperScan;

import java.util.Date;
import java.util.List;

@Mapper
public interface UserMapper {

    //增
//    Integer adduser(@Param("username") String username,
//                    @Param("password") String password,
//                    @Param("sex") byte sex,
//                    @Param("createtime") Date createtime,
//                    @Param("lasttime") Date lasttime);
    Integer insert(User user);

    //删
    Integer deleteuser(@Param("id") long id);

    //改
//    Integer updateuser(@Param("id") long id,
//                       @Param("username") String username,
//                       @Param("password") String password,
//                       @Param("sex") byte sex,
//                       @Param("createtime") Date createtime,
//                       @Param("lasttime") Date lasttime);
    Integer update(User user);

    //查单条
    User selectuserByid(@Param("id") long id);

    //查全部
    List<User> selectuser();

}

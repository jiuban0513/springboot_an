package com.boot.mapper;

import com.boot.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

//@Mapper(当main方法类中添加@MapperScan("")注解去扫描类时，mapper接口可以不用写@Mapper；
// 建议在main方法类中添加注解扫描，这种不用每个mapper接口都添加@Mapper注解)
public interface UserMapper {

    //增
    //@Insert 插入数据库使用，直接传入实体类会自动解析属性到对应的值
    @Insert("Insert into user(username,password,sex,createtime,lasttime) " +
            "values(#{username},#{password},#{sex},#{createtime},#{lasttime})")
    Integer adduser(@Param("username")String username,
                    @Param("password")String password,
                    @Param("sex")byte sex,
                    @Param("createtime") Date createtime,
                    @Param("lasttime")Date lasttime);
    @Insert("Insert into user(username,password,sex,createtime,lasttime) " +
            "values(#{username},#{password},#{sex},#{createtime},#{lasttime})")
    Integer insert(User user);

    //删
    @Delete("Delete from user where id = #{id}")
    Integer deleteuser(@Param("id")long id);

    //改（注意：时间Date类型不用判断=‘’这种情况，报异常：invalid comparison: java.util.Date and java.lang.String）
    //@Update 负责修改，也可以直接传入对象
//    @Update("Update user set username = #{username},password = #{password}," +
//            "sex = #{sex},createtime = #{createtime},lasttime = #{lasttime} where id = #{id}")
    @Update("<script> " + "update user" +
            "<set>" + "<if test=\"username != null and username !=''\">username=#{username},</if>" +
            "<if test=\"password != null and password !=''\">password=#{password},</if>" +
            "<if test=\"sex != null and sex !=''\">sex=#{sex},</if>" +
            "<if test=\"createtime !=null \">createtime=#{createtime},</if>" +
            "<if test=\"lasttime !=null \">lasttime=#{lasttime},</if>" +
            "</set>" + "where id=#{id}" +
            " </script> ")
    Integer updateuser(@Param("id")long id,
                       @Param("username")String username,
                       @Param("password")String password,
                       @Param("sex")byte sex,
                       @Param("createtime") Date createtime,
                       @Param("lasttime")Date lasttime);
//    void update(User user);

    //查单条
    @Select("select * from user where id = #{id}")
    //@Result 修饰返回的结果集，关联实体类属性和数据库字段一一对应，如果实体类属性和数据库属性名保持一致，就不需要这个属性来修饰。
//    @Results({
//            @Result(property = "username",  column = "username"),//javaType = UserSexEnum.class
//            @Result(property = "password", column = "password")
//    })
    User selectuserByid(@Param("id")long id);

    //查全部
    @Select("select * from user")
    List<User> selectuser();

}

package com.boot.entity;

import com.alibaba.fastjson.JSON;

import java.util.Date;

public class User {

    private long id;
    private String username;
    private String password;
    private byte sex;
    private Date createtime;
    private Date lasttime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

    public User(){

    }

    public User(String username, String password, byte sex, Date createtime, Date lasttime) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.createtime = createtime;
        this.lasttime = lasttime;
    }

    @Override
    public String toString() {
        return JSON.toJSONString("User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", createtime=" + createtime +
                ", lasttime=" + lasttime +
                '}');
    }
}

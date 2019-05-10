package com.boot.service;

import com.boot.entity.User;
import com.mongodb.client.result.DeleteResult;

public interface IUserService {

    public User insertUser(User user);

    public DeleteResult deleteUser(Long id);

    public long updateUser(User user);

    public User selectUserByUsername(String username);

}

package com.lxc.service;

import com.lxc.project.User;

import java.sql.SQLException;

public interface UserService {
    //注册用户
    public void registUser(User user);

    //登录
    public User login(User user) throws SQLException;

    //检查是否存在用户名
    public boolean existUsername(String username);

}

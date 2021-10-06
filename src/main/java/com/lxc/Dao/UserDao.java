package com.lxc.Dao;

import com.lxc.project.User;

import java.sql.SQLException;

public interface UserDao {
    //查询是否该用户名
    public User queryUserByUsername(String username) throws SQLException;

    //查询账号密码是否正确
    public User queryUserByUsernameAndPassword(String username,String password) throws SQLException;

    //保存用户信息
    public int saveUser(User user) throws SQLException;

}

package com.lxc.Dao.impl;

import com.lxc.Dao.UserDao;
import com.lxc.project.User;

import java.sql.SQLException;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryUserByUsername(String username) throws SQLException {
        String sql ="select id,username,password from user where username=?";

        return queryForOne(User.class,sql,username);
    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) throws SQLException {
        String sql ="select id,username,password from user where username=?and password=?";

        return queryForOne(User.class,sql,username,password);
    }

    @Override
    public int saveUser(User user) throws SQLException {
        String sql = "insert into user (username,password) values(?,?)";
        return update(sql,user.getUsername(),user.getPassword());
    }
    /*返回1 成功
    返回-1
     */
}

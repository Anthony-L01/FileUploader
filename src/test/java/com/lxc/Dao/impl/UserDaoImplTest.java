package com.lxc.Dao.impl;


import com.lxc.Dao.UserDao;
import com.lxc.project.User;
import org.junit.Test;

import java.sql.SQLException;

public class UserDaoImplTest {

    @Test
    public void queryUserByUsername() throws SQLException {
        UserDao userDao=new UserDaoImpl();
        System.out.println(userDao.queryUserByUsername("Anthony"));
    }

    @org.junit.Test
    public void queryUserByUsernameAndPassword() {
        UserDao userDao=new UserDaoImpl();
        try {
            System.out.println(userDao.queryUserByUsernameAndPassword("Anthony","13456"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @org.junit.Test
    public void saveUser() throws SQLException {
        UserDao userDao=new UserDaoImpl();
        System.out.println(userDao.saveUser(new User("admin","123456")));
    }
}
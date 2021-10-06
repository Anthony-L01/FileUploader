package com.lxc.service.impl;

import com.lxc.project.User;
import com.lxc.service.UserService;
import org.junit.Test;

import java.sql.SQLException;

public class UserServiceImplTest {
    UserService userService = new UserServiceImpl();
    @Test
    public void registUser() {
        userService.registUser(new User("yxn","123456"));
    }

    @Test
    public void login() throws SQLException {

        System.out.println(userService.login(new User("yxn","123456")));
    }

    @Test
    public void existUsername() {
        System.out.println(userService.existUsername("yxn"));
    }
}
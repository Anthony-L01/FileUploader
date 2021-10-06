package com.lxc.service.impl;

import com.lxc.Dao.UserDao;
import com.lxc.Dao.impl.UserDaoImpl;
import com.lxc.project.User;
import com.lxc.service.UserService;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();
    @Override
    public void registUser(User user) {
        try {
            userDao.saveUser(user);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public User login(User user) throws SQLException {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public boolean existUsername(String username) {
        try {
            if(userDao.queryUserByUsername(username)==null)return false;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return true;
    }
}

package com.lxc.web;

import com.lxc.project.User;
import com.lxc.service.UserService;
import com.lxc.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        UserService userService = new UserServiceImpl();
        try {
            if(!userService.existUsername(username))
            {
                req.setAttribute("msg","用户名不存在");
                req.getRequestDispatcher("/index.jsp").forward(req,resp);
            }
           else if(userService.login(new User(username,password))!=null)
            {
                req.getRequestDispatcher("/static/jsp/MainPage.jsp").forward(req,resp);
            }
            else
            {
                req.setAttribute("msg","用户名或者密码错误");
                req.getRequestDispatcher("/index.jsp").forward(req,resp);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

package com.lxc.web;

import com.lxc.project.User;
import com.lxc.service.UserService;
import com.lxc.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class RegistServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String username =request.getParameter("username");
//        String password =request.getParameter("password");
//        System.out.println(username);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username =request.getParameter("username");
    String password =request.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        UserService userService = new UserServiceImpl();
        if(userService.existUsername(username))
        {
            request.setAttribute("msg","用户名已存在");
            request.getRequestDispatcher("/static/jsp/register.jsp").forward(request,response);
        }
        else
        {

            userService.registUser(new User(username,password));
            request.getRequestDispatcher("/static/jsp/registSuccess.jsp").forward(request,response);
        }
    }
}

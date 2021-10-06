package com.lxc.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class UploadServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/static/jsp/UploadSuccess.jsp").forward(request,response);
    }
}

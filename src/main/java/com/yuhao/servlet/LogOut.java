package com.yuhao.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LogOut extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //注销 session
        Object user_name = req.getSession().getAttribute("USER_NAME");
        if (!user_name.equals(null)){
            req.getSession().removeAttribute("USER_NAME");
            //return to the login page
            resp.sendRedirect("/servlet/Login.jsp");
        }else{
            resp.sendRedirect("/servlet/Login.jsp");
        }




    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}

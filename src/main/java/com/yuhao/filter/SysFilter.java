package com.yuhao.filter;

import com.yuhao.util.Constant;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SysFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
       //因为ServletRequest 拿不到http的session , 所以要强制转换为HtttpServlet\
        //  since we have to get http session , so we have to convet into HttpServlet 
        HttpServletRequest servletRequest1 = (HttpServletRequest) servletRequest;
        HttpServletResponse servletResponse1 = (HttpServletResponse) servletResponse;
        Object userName = servletRequest1.getSession().getAttribute(Constant.User_name);
        if (userName == null){
            // redirect to the login jsp
            servletResponse1.sendRedirect("/servlet/error.jsp");
        }else{
            filterChain.doFilter(servletRequest,servletResponse);
        }


    }

    @Override
    public void destroy() {

    }
}

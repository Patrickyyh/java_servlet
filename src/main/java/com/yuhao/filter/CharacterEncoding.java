package com.yuhao.filter;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncoding implements Filter {

    // 初始化

    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("CharacterEnconding init");
    }
    // chain
     /*
     1. 过滤中的所有代码,在过滤特定请求的时候都会执行
     2/ 必须要让过滤器继续通行


      */
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
 // 中间的业务代码
        servletRequest.setCharacterEncoding("utf-8");
          servletResponse.setCharacterEncoding("utf-8");
          servletResponse.setContentType("text/html;charset= utf-8");

          System.out.println("execution before");
          filterChain.doFilter(servletRequest,servletResponse);
          System.out.println("execution after");
    }
   // 销毁
    public void destroy() {
        System.gc();
        System.out.println("character Encoding destroy");
    }
}

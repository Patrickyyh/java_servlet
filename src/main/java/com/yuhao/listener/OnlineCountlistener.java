package com.yuhao.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

//统计网站在线的人数 统计session
//一旦创建一个session , 就会触发这个事件
public class OnlineCountlistener implements HttpSessionListener {
    //创建Session的监听
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        ServletContext servletContext = se.getSession().getServletContext();
        Integer onlineCount = (Integer) servletContext.getAttribute("OnlineCount");
        System.out.println(se.getSession().getId());
        if (onlineCount == null){
             onlineCount = new Integer(1);
        }else{
          int count =  onlineCount.intValue();
          onlineCount = new Integer(count+1);
        }
        servletContext.setAttribute("OnlineCount",onlineCount);

    }
    // 销毁Session的监听
    //一旦销毁session就会触发这个事件
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        ServletContext servletContext = se.getSession().getServletContext();
        Integer onlineCount = (Integer) servletContext.getAttribute("OnlineCount");
        if (onlineCount == null){
            onlineCount = new Integer(0);
        }else{
            int count =  onlineCount.intValue();
            onlineCount = new Integer(count-1);
        }
        servletContext.setAttribute("OnlineCount",onlineCount);
    }
}

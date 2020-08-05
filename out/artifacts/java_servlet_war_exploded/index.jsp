<%--
  Created by IntelliJ IDEA.
  User: e3270
  Date: 8/2/2020
  Time: 2:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>当前有<span><%=this.getServletConfig().getServletContext().getAttribute("OnlineCount")%></span></h1>
  </body>
</html>

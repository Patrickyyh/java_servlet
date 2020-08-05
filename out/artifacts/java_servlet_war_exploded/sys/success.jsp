<%--
  Created by IntelliJ IDEA.
  User: e3270
  Date: 8/3/2020
  Time: 1:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>main page</h1>
<a href="/servlet/servlet/logout">sign off</a>


<%--防止外界直接访问所谓非此页面--%>
<%--
<%
    Object userName = request.getSession().getAttribute("USER_NAME");
    if (userName == null){
        response.sendRedirect("/servlet/Login.jsp");
    }
%>
--%>



</body>
</html>

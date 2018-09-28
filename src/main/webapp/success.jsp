<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<h1>Success!!!<br/>
    Welcome:
    <shiro:hasRole name="admin">admin</shiro:hasRole>
    <shiro:hasPermission name="admin:select">admin:select</shiro:hasPermission>
    <shiro:hasRole name="user">user</shiro:hasRole>
    <shiro:hasPermission name="user:select">user:select</shiro:hasPermission>
    <br/>
    <a href="logout">logout</a>
</h1>
</body>
</html>

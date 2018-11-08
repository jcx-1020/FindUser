<%--
  Created by IntelliJ IDEA.
  User: J丶晨星
  Date: 2018/11/8
  Time: 12:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查询</title>
</head>
<body>
<table border="1" width="100%">
    <thead>
        <tr>
            <td>用户名</td>
            <td>密码</td>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${users}" var="u">
            <tr>
                <td>${u.username}</td>
                <td>${u.password}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>

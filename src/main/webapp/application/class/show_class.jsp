<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: shuxian
  Date: 2019-04-02
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<table border="1px" cellspacing="0px">
    <tr>
        <th>
            编号
        </th>

        <th>
            班级名字
        </th>
        <th>
            操作
        </th>
    </tr>
    <c:forEach items="${classlist}" var="c">
        <tr>
            <td>${c.id}</td>
            <td>${c.className}</td>
            <td><a>修改</a>
            |<a>删除</a> </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/2
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <base href="<%=request.getContextPath()+"/"%>">
    <title>添加学生</title>
</head>
<body>
    <form action="" method="post">
        <table>

            学生姓名： <input type="text" name="stuName"><br/>
            所属班级：<input type="text" name="className"><br/>
            性别：<input type="text" name="stuSex"><br/>
            年龄：<input type="text" name="stuAge"><br/>
            生日：<input type="text" name="stuBirthday"><br/>
            <input type="submit" value="添加">
            <input type="reset" value="重置">
            ${msg}
        </table>
    </form>
</body>
</html>

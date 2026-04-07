<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin BVCN88 02
  Date: 4/7/2026
  Time: 9:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Code: ${emp.code}</h1>
<h1>Name: ${emp.name}</h1>
<h1>Salary: <fmt:formatNumber value="${emp.salary}" type="currency" currencyCode="VND"/> </h1>
<h1>Department:${emp.department}</h1>
<h1>Join Date : <fmt:formatDate value="${emp.date}" pattern="dd/MM/yyyy"/></h1>
<h1>Status : ${emp.status}</h1>
</body>
</html>

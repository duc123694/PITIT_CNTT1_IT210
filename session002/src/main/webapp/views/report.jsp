<%--
  Created by IntelliJ IDEA.
  User: Admin BVCN88 02
  Date: 4/7/2026
  Time: 9:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1><c:out value="${reportTitle}" /></h1>

<table border="1">
    <thead>
    <tr>
        <th>STT</th>
        <th>Họ tên</th>
        <th>Điểm</th>
        <th>Xếp loại</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="sv" items="${studentList}" varStatus="status">
        <tr>
                <%-- Dùng varStatus để lấy số thứ tự --%>
            <td>${status.count}</td>

                <%-- Dùng c:out để chống lỗi XSS --%>
            <td><c:out value="${sv.fullName}" /></td>

                <%-- Dùng EL để lấy dữ liệu gọn gàng --%>
            <td>${sv.score}</td>

            <td>
                    <%-- Chuyển logic xếp loại sang JSTL --%>
                <c:choose>
                    <c:when test="${sv.score >= 90}">Xuất sắc</c:when>
                    <c:when test="${sv.score >= 80}">Giỏi</c:when>
                    <c:when test="${sv.score >= 70}">Khá</c:when>
                    <c:when test="${sv.score >= 60}">Trung bình khá</c:when>
                    <c:when test="${sv.score >= 50}">Trung bình</c:when>
                    <c:otherwise>Yếu</c:otherwise>
                </c:choose>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>

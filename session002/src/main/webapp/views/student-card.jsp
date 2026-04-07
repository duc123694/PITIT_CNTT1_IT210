<%--
  Created by IntelliJ IDEA.
  User: Admin BVCN88 02
  Date: 4/7/2026
  Time: 9:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <style>
    .card { border: 2px solid #333; padding: 20px; width: 400px; border-radius: 10px; margin-top: 20px; }
    .error { color: red; font-weight: bold; padding: 10px; border: 1px solid red; display: inline-block; }
    .rank-gioi { color: green; font-weight: bold; }
    .rank-kha { color: blue; font-weight: bold; }
    .rank-trungbinh { color: orange; font-weight: bold; }
    .rank-canhbao { color: red; font-weight: bold; text-transform: uppercase; }
  </style>
</head>
<body>

<h2>Tra cứu thẻ sinh viên</h2>

<%-- 1. Hiển thị thông báo lỗi nếu có --%>
<c:if test="${not empty errorMessage}">
  <div class="error">
    <c:out value="${errorMessage}" />
  </div>
</c:if>

<%-- 2. Hiển thị thẻ sinh viên nếu tìm thấy dữ liệu --%>
<c:if test="${not empty studentName}">
  <div class="card">
    <h3>THẺ SINH VIÊN</h3>
    <p><strong>Mã số:</strong> ${param.msv}</p>
    <p><strong>Họ tên:</strong> <c:out value="${studentName}" /></p>
    <p><strong>Khoa:</strong> ${faculty}</p>
    <p><strong>Năm học:</strong> ${year}</p>
    <p><strong>GPA:</strong> ${gpa}</p>

    <p><strong>Xếp loại:</strong>
      <c:choose>
        <c:when test="${gpa >= 8.0}">
          <span class="rank-gioi">Giỏi</span>
        </c:when>
        <c:when test="${gpa >= 6.5}">
          <span class="rank-kha">Khá</span>
        </c:when>
        <c:when test="${gpa >= 5.0}">
          <span class="rank-trungbinh">Trung bình</span>
        </c:when>
        <c:otherwise>
          <span class="rank-canhbao">Cảnh báo học vụ</span>
        </c:otherwise>
      </c:choose>
    </p>
  </div>
</c:if>

<br>
<a href="${pageContext.request.contextPath}/student-card">Tra cứu sinh viên khác</a>

</body>
</html>

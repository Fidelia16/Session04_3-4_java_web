<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Phu
  Date: 2025/11/10
  Time: 4:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/controller/search" method="get" class="search-form">
    <input
            type="text"
            name="keyword"
            placeholder="Nhap ten san pham..."
            class="search-input"
            value="${keyword}"
    />
    <button type="submit" class="search-btn">Tim kiem</button>
    <a href="${pageContext.request.contextPath}/controller/greet">Xem tat ca</a>
</form>
    <table border="1">
        <thead>
        <tr>
            <th>ID</th>
            <th>Ten</th>
            <th>Gia</th>
            <th>So luong</th>
            <th>Mo ta</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach items="${products}" var="product" varStatus="loop">
                <tr>
                <td>${loop.index+1}</td>
                <td>${product.productName}</td>
                <td>${product.price}</td>
                <td>${product.stock}</td>
                <td>${product.description}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 4/22/2024
  Time: 9:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Save Page</title>
</head>
<body>
<h1>đã chọn gia vị</h1>
<c:forEach items="${GiaVi}" var="GiaVi">
    <p>${GiaVi}</p>
</c:forEach>
</body>
</html>

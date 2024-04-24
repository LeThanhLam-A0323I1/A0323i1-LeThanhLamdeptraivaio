<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 4/24/2024
  Time: 6:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
<h1>Calculator</h1>
<form action="/calculate/result" method="post">
    <input type="number" name="num1">
    <input type="number" name="num2" style="margin-bottom: 20px">
    <br>
    <input type="submit" value="Addition(+)" name="calculation">
    <input type="submit" value="Subtraction(-)" name="calculation">
    <input type="submit" value="Multiplication(*)" name="calculation">
    <input type="submit" value="Division(/)" name="calculation">
</form>
<h3>Result ${calculate}: ${result}</h3>
</body>
</html>

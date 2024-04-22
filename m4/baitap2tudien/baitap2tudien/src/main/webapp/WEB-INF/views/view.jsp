<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 4/22/2024
  Time: 6:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Từ điển</title>
  <style>
    body {
      background-color: #f2f2f2;
      font-family: Arial, sans-serif;
      margin: 20px;
    }

    h1 {
      color: #333;
      text-align: center;
      margin-bottom: 30px;
    }

    form {
      text-align: center;
      margin-bottom: 20px;
    }

    label {
      font-weight: bold;
    }

    input[type="text"] {
      padding: 8px;
      font-size: 16px;
      width: 200px;
    }

    input[type="submit"] {
      padding: 8px 20px;
      font-size: 16px;
      background-color: #cab342;
      color: #ffffff;
      border: none;
      cursor: pointer;
    }

    h3 {
      color: #000dff;
      text-align: center;
    }
  </style>
</head>
<body>
<h1>Từ điển</h1>
<form action="/TuDien/result" method="post">
  <label for="keyword">Keyword: </label>
  <input type="text" id="keyword" name="keyword">
  <input type="submit" value="Search">
</form>
<h3>Word: ${word}</h3>
</body>
</html>

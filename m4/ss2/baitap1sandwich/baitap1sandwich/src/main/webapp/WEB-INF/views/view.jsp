<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 4/22/2024
  Time: 9:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sandwich Condiments</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        .container {
            width: 50%;
            margin: 50px auto;
        }
        h1 {
            text-align: center;
        }
        form {
            background-color: #f2f2f2;
            padding: 20px;
            border-radius: 10px;
        }
        fieldset {
            border: none;
        }
        legend {
            font-weight: bold;
            font-size: 1.2em;
            margin-bottom: 10px;
        }
        label {
            display: block;
            margin-bottom: 10px;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Sandwich Condiments</h1>
    <form action="/GiaVi/save" method="post">
        <fieldset>
            <legend>Choose condiments:</legend>
            <label><input type="checkbox" name="condiment" value="Lettuce">Xà Lách</label>
            <label><input type="checkbox" name="condiment" value="Tomato">cà chua</label>
            <label><input type="checkbox" name="condiment" value="Mustard">mù tạc</label>
            <label><input type="checkbox" name="condiment" value="Sprout">giá đỗ</label>
        </fieldset>
        <input type="submit" value="Save">
    </form>
</div>
</body>
</html>


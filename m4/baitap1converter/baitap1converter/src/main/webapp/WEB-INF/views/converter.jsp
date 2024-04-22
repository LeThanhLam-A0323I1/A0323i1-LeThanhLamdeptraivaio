<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Ứng dụng</title>
  <!-- Include Bootstrap CSS -->
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet">

  <style>
    body {
      background-color: #f8f9fa;
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
    }

    .container {
      max-width: 400px;
      margin: 50px auto;
      padding: 20px;
      background-color: #fff;
      border-radius: 5px;
      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    }

    .container h3 {
      text-align: center;
      margin-bottom: 30px;
      color: #333;
    }

    .form-group label {
      font-weight: bold;
    }

    .form-group input[type=text] {
      width: 100%;
      padding: 10px;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
    }

    .form-group button {
      width: 100%;
      padding: 10px;
      margin-top: 20px;
      background-color: #007bff;
      color: #fff;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }

    .form-group button:hover {
      background-color: #0069d9;
    }
  </style>
</head>
<body>
<div class="container">
  <h3>Currency Converter</h3>
  <form action="/converter/submit" method="post">
    <div class="form-group">
      <label for="usd">USD:</label>
      <input type="text" id="usd" name="usd" value="24000">
    </div>
    <div class="form-group">
      <label for="rate">Rate:</label>
      <input type="text" id="rate" name="rate" value="0">
    </div>
    <button type="submit">Converter</button>
  </form>
</div>

<!-- Include Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>

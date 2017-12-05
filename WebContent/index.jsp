<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>UGA Chemistry Login Portal</title>
</head>
<body>
<div class="login-page">
  <div class="form">
    <form class="register-form" action="register" method="post">
      <input type="text" name="email" required placeholder="email address"/>
      <input type="password" name="password" required placeholder="password"/>
      <button type="submit">create</button>
      <p class="message">Already registered? <a href="#">Sign In</a></p>
    </form>
    <form class="login-form" action="login" method="post">
      <input type="text" name="email" required placeholder="email address"/>
      <input type="password" name="password" required placeholder="password"/>
      <button>login</button>
      <p class="message">Not registered? <a href="#">Create an account</a></p>
    </form>
  </div>
</div>
<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script  src="script.js"></script>
</body>
</html>
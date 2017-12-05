<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<form action="register" method="post">
  First name:<br>
  <input type="text" name="firstname" required><br>
  Last name:<br>
  <input type="text" name="lastname" required><br>
  Email address:<br>
  <input type="text" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$"
  required><br>
  Password:<br>
  <input type="text" name="password"><br>

  <input type="submit" value="submitRegistration">

</form>
</body>
</html>
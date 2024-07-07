<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Register Page</h1>
<form action="/DevJava/RegisterServ" method="post">
	<input type="text" name="usernames">
	<input type="text" name="user_name">
	<input type="password" name="pass">
	<button type="submit">Register</button>
</form>
</body>
</html>
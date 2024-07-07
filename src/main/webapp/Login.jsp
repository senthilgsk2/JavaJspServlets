<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
 import="java.util.*"
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! 
	int a []= {10, 20, 30};
	int test(){
		return a[2];
	}
%>
<h2><%= test()%></h2>

<h1>Login Page</h1>
<form action="/DevJava/LoginServ" method="post">
	<input type="text" name="username">
	<input type="password" name="password">
	<button type="submit">Login</button>
</form>
<a href="Register.jsp">New User Register Here</a>
</body>


</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	String c = request.getParameter("color");
	c.trim();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	body {
	background-color: <%= c%>;
}
</style>
</head>
<body>


</body>
</html>
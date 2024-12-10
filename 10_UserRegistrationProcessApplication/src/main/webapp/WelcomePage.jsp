<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String username=(String)request.getAttribute("username");
	%>
	<h1>Welcome back <%=username %></h1>
	<a href="view">View Profile</a>
	<a href="logout"> Logout</a>
</body>
</html>
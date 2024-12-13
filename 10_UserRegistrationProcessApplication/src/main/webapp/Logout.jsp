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
		Cookie c[] = request.getCookies();
		c[0].setMaxAge(0);
		response.addCookie(c[0]);
		out.println("User logged out Successfully....<br>");
	%>
	<%@include file="login.html" %>
</body>
</html>
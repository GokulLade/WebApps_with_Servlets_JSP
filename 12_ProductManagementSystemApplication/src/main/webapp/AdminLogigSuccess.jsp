<%@page import="javabean.AdminBean"%>
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
		AdminBean ub=(AdminBean)session.getAttribute("adminbean");
		out.print("Welcome admin : "+ub.getFname()+"<br><br>");
	%>
	<a href="product.html">Add Product</a><br><br>
	<a href="view">View All Product</a><br><br>
	<a href="logout">Logout</a>
</body>
</html>
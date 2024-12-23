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
	AdminBean ab = (AdminBean)session.getAttribute("adminbean");
	String msg = (String)request.getAttribute("msg");
	out.println("Page belongs to Admin:"+ab.getFname()+"<br>");
	out.println(msg);
%>
<a href="product.html" >Add Product</a><br><br>
<a href="view" >View All Product</a><br><br>
<a href="logout" >Logout</a><br><br>
</body>
</html>
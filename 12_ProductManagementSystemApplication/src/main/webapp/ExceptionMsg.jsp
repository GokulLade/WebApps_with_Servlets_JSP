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
		AdminBean ab=(AdminBean)session.getAttribute("adminbean");
		String exMsg=(String)request.getAttribute("exMsg");
		
		out.print("Page belongs to :"+ab.getFname()+"<br>");
		out.print(exMsg);
	%>
	<%@include file="product.html" %>
</body>
</html>
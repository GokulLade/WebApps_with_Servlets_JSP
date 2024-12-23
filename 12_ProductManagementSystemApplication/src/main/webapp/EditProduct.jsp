<%@page import="javabean.AdminBean"%>
<%@page import="javabean.ProductBean"%>
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
		ProductBean pb = (ProductBean)request.getAttribute("pbean");
		out.println("Page belongs to Admin:"+ab.getFname()+"<br>");
	%>
	
	<form action="update" method="post">
		<input type="hidden" name="pcode" value=<%=pb.getCode() %>><br>
		
		Product-Price: <input type="text" name="price" value="<%=pb.getPrice() %>"><br>
		Product-Qty: <input type="text" name="qty" value="<%= pb.getQty()%>">
		
		<input type="submit" value="UpdateProduct">
	</form>
</body>
</html>
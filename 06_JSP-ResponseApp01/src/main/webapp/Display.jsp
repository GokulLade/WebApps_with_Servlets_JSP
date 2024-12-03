<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Data</title>
</head>
<body>
	<%
		String code=request.getParameter("bCode");
		String name=request.getParameter("bName");
		String author=request.getParameter("bAuthor");
		float price=Float.parseFloat(request.getParameter("bPrice"));
		int qty=Integer.parseInt(request.getParameter("bQty"));
		
		out.println("--------------Book Detais--------------<br>");
		out.println("Book Code is: "+code+"<br>");
		out.println("Book Name is: "+name+"<br>");
		out.println("Book Author is: "+author+"<br>");
		out.println("Book price is: "+price+"<br>");
		out.println("Book Quantity is: "+qty+"<br>");
	%>
</body>
</html>
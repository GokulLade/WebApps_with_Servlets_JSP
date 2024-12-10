<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Welcome Page</title>
</head>
<body>
	
	 <% 
	  	String msg = (String)request.getAttribute("msg");
	 	out.print(msg);
	 %>
	 <%@include file="login.html" %>
</body>
</html>

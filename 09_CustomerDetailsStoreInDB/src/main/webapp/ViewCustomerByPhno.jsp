<%@page import="javabean.CustomerDetailBean"%>
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
		CustomerDetailBean cb=(CustomerDetailBean)request.getAttribute("BeanObj");
	%>
	<table border="1" cellspacing="0" cellpadding="5">
		<thead>
			<tr>
				<th>Phone Number</th>
				<th>Name</th>
				<th>City</th>
				<th>Email</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><%=cb.getPhno() %></td>
				<td><%=cb.getName() %></td>
				<td><%=cb.getCity() %></td>
				<td><%=cb.getEmail() %></td>
			</tr>
		</tbody>
	</table>
</body>
</html>
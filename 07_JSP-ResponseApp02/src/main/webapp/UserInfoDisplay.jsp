<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	div{
		height:500px;
		display:flex;
		flex-direction:column;
		justify-content: center;
		align-items: center;
	}
	table{
		width: 500px;
		border:1px solid black;
		box-shadow: 1px 1px 10px gray;
	}
</style>
</head>
<body>
	<%
		String fname=request.getParameter("uFName");
		String lname=request.getParameter("uLName");
		int age=Integer.parseInt(request.getParameter("uAge"));
		String email=request.getParameter("uEmail");
		long phno=Long.parseLong(request.getParameter("uPhno"));
		
	%>
	<div>
		<h1>User Information </h1>
		<table border="1">
			<thead>
				<tr>
					<th>First Name </th>
					<th>Last Name </th>
					<th>Age </th>
					<th>Email </th>
					<th>Phone Number</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><%=fname %></td>
					<td><%=lname %></td>
					<td><%=age %></td>
					<td><%=email %></td>
					<td><%=phno %></td>
				</tr>
			</tbody>
		</table>
	</div>
	
</body>
</html>
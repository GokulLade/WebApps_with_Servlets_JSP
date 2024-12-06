<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*, javabean.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	ArrayList<CustomerDetailBean> al = (ArrayList<CustomerDetailBean>) request.getAttribute("list");

	Iterator<CustomerDetailBean> it = al.iterator();
	%>
	<table border="1" cellspacing="0" cellpadding="5">
		<tr>
			<th>Phone Number</th>
			<th>Name</th>
			<th>City</th>
			<th>Email</th>
		</tr>
		<%
		while (it.hasNext()) {
			CustomerDetailBean cb = (CustomerDetailBean) it.next();
		%>
		<tr>
			<td><%=cb.getPhno()%></td>
			<td><%=cb.getName()%></td>
			<td><%=cb.getCity()%></td>
			<td><%=cb.getEmail()%></td>
		</tr>
		<%
		}
		al.clear();
		%>
	</table>
</body>
</html>
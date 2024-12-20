<%@page import="java.util.Iterator"%>
<%@page import="javabean.AdminBean"%>
<%@page import="javabean.ProductBean"%>
<%@page import="java.util.ArrayList"%>
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
	AdminBean ab = (AdminBean) session.getAttribute("adminbean");

	ArrayList<ProductBean> al = (ArrayList<ProductBean>) session.getAttribute("alist");

	out.print("Page Belong to Admin: " + ab.getFname() + "<br>");

	Iterator<ProductBean> it = al.iterator();

	while (it.hasNext()) {
		ProductBean pb = (ProductBean) it.next();

		out.println(pb.getCode() + "&nbsp;&nbsp;" + pb.getName() + "&nbsp;&nbsp;" + pb.getPrice() + "&nbsp;&nbsp;"
		+ pb.getQty() + "&nbsp;&nbsp;" + "<a href='edit?pcode=" + pb.getCode() + "'>Edit</a>" + "&nbsp;&nbsp;"
		+ "<a href='delete?pcode=" + pb.getCode() + "'>Delete</a>" + "<br>");
	}
	al.clear();
	%>
	<br>

	<a href="product.html">Add Product</a>
	<br>
	<br>
	<a href="logout">Logout</a>
</body>
</html>
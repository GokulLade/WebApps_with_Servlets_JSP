<%@page import="javabean.UserDataBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
        table {
            width: 50%;
            border-collapse: collapse;
            margin: 20px auto;
            font-family: Arial, sans-serif;
        }
        th, td {
            border: 1px solid #ddd;
            text-align: left;
            padding: 8px;
        }
        th {
            background-color: #f4f4f4;
        }
        a {
            display: block;
            text-align: center;
            margin-top: 20px;
            text-decoration: none;
            color: #007BFF;
            font-weight: bold;
        }
        a:hover {
            color: #0056b3;
        }
    </style>
</head>
<body>

	<%
		String fN = (String)request.getAttribute("fname");
		UserDataBean ub= (UserDataBean)application.getAttribute("ubean");
	%>
	<h2 style="text-align: center;">Page belongs to User: <%= fN %></h2>
    <table>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>City</th>
            <th>Email</th>
            <th>Phone Number</th>
        </tr>
        <tr>
            <td><%= ub.getFname() %></td>
            <td><%= ub.getLname() %></td>
            <td><%= ub.getCity() %></td>
            <td><%= ub.getMid() %></td>
            <td><%= ub.getPhno() %></td>
        </tr>
    </table>
    <a href="edit">Edit Profile</a>
</body>
</html>
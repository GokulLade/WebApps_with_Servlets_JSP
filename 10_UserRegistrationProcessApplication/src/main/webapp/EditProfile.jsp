<%@page import="javabean.UserDataBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f9f9f9;
            color: #333;
        }
        .container {
            width: 50%;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ddd;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
            color: #007BFF;
        }
        form {
            margin: 20px 0;
        }
        label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
        }
        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="submit"] {
            background-color: #007BFF;
            color: #fff;
            border: none;
            padding: 10px 15px;
            border-radius: 4px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<div class="container">
        <h1>User Profile Update</h1>
        <%
            String fN = (String) request.getAttribute("fname");
            UserDataBean ub = (UserDataBean) application.getAttribute("ubean");
        %>
        <p><strong>Page belongs to User:</strong> <%= fN %></p>
        
        <form action="update" method="post">
            <label for="city">City:</label>
            <input type="text" id="city" name="city" value="<%= ub.getCity() %>">
            
            <label for="mid">Mail ID:</label>
            <input type="text" id="mid" name="mid" value="<%= ub.getMid() %>">
            
            <label for="phno">Phone Number:</label>
            <input type="text" id="phno" name="phno" value="<%= ub.getPhno() %>">
            
            <input type="submit" value="Update Profile">
        </form>
    </div>

</body>
</html>
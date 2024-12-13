<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Login Page</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        min-height: 100vh;
        background-color: #f5f5f5;
    }
    .message {
        color: #ffffff;
        background-color: #007bff;
        padding: 10px 20px;
        border-radius: 5px;
        margin-bottom: 20px;
    }
    h3 {
        margin: 0;
    }
</style>
</head>
<body>
    <%
        String msg = (String) request.getAttribute("msg");
    
    %>
    <div class="message">
     	<h3><%= msg %></h3>
    </div>
        
    <div class="login-container">
        <jsp:include page="customerlogin.html" />
    </div>
</body>
</html>

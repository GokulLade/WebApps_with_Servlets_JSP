<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Welcome Page</title>
<style>
    /* General Reset */
    body, html {
        margin: 0;
        padding: 0;
        font-family: 'Arial', sans-serif;
        background: linear-gradient(135deg, #1e90ff, #ff69b4);
        color: #fff;
        overflow: hidden;
    }

    /* Background Animation */
    body::before {
        content: '';
        position: absolute;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        background: radial-gradient(circle, rgba(255, 255, 255, 0.2), transparent);
        z-index: 0;
        animation: gradient-animation 10s infinite;
    }

    @keyframes gradient-animation {
        0% { background-position: 0% 50%; }
        50% { background-position: 100% 50%; }
        100% { background-position: 0% 50%; }
    }

    /* Centered Container */
    .container {
        position: relative;
        z-index: 1;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        height: 100vh;
        text-align: center;
    }

    h1 {
        font-size: 3rem;
        animation: fade-in 3s ease-in-out;
    }

    @keyframes fade-in {
        0% { opacity: 0; transform: translateY(-20px); }
        100% { opacity: 1; transform: translateY(0); }
    }

    p {
        font-size: 1.5rem;
        margin: 1rem 0;
        animation: fade-in 4s ease-in-out;
    }

    a {
        display: inline-block;
        text-decoration: none;
        font-size: 1.2rem;
        color: #1e90ff;
        background-color: #fff;
        padding: 0.5rem 1.5rem;
        border-radius: 50px;
        box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);
        transition: all 0.3s ease;
        animation: fade-in 5s ease-in-out;
    }

    a:hover {
        background-color: #ff69b4;
        color: #fff;
        transform: scale(1.1);
        box-shadow: 0px 8px 16px rgba(0, 0, 0, 0.4);
    }

    /* Floating Elements */
    .floating-circles {
        position: absolute;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        z-index: 0;
    }

    .circle {
        position: absolute;
        background: rgba(255, 255, 255, 0.1);
        border-radius: 50%;
        animation: float 6s infinite ease-in-out;
    }

    .circle:nth-child(1) { width: 100px; height: 100px; top: 20%; left: 10%; animation-duration: 8s; }
    .circle:nth-child(2) { width: 150px; height: 150px; top: 50%; left: 70%; animation-duration: 12s; }
    .circle:nth-child(3) { width: 50px; height: 50px; top: 80%; left: 30%; animation-duration: 10s; }

    @keyframes float {
        0% { transform: translateY(0); }
        50% { transform: translateY(-20px); }
        100% { transform: translateY(0); }
    }
</style>
</head>
<body>
    <div class="floating-circles">
        <div class="circle"></div>
        <div class="circle"></div>
        <div class="circle"></div>
    </div>
    <div class="container">
        <% 
            String userName = (String)request.getAttribute("username");
            if (userName == null) {
                userName = "Guest";
            }
        %>
        <h1>Welcome, <%= userName %>!</h1>
        <p>We are excited to have you here.</p>
        <a href="login.html">Go to Login</a>
    </div>
</body>
</html>

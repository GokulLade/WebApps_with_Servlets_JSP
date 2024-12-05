<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, javabean.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 20px;
            padding: 20px;
        }
        h1 {
            text-align: center;
            color: #333;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px auto;
        }
        table th, table td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: left;
        }
        table th {
            background-color: #007bff;
            color: white;
        }
        table tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        table tr:hover {
            background-color: #ddd;
        }
        a {
            display: block;
            width: fit-content;
            margin: 20px auto;
            text-decoration: none;
            background-color: #007bff;
            color: white;
            padding: 10px 20px;
            border-radius: 5px;
            text-align: center;
        }
        a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h1>Book Details</h1>
    <table>
        <tr>
            <th>Code</th>
            <th>Name</th>
            <th>Author</th>
            <th>Price</th>
            <th>Quantity</th>
        </tr>
        <%
            ArrayList<BookBean> al = (ArrayList<BookBean>) request.getAttribute("allist");
            Iterator<BookBean> it = al.iterator();
            
            while (it.hasNext()) {
                BookBean bb = (BookBean) it.next();
        %>
        <tr>
            <td><%= bb.getCode() %></td>
            <td><%= bb.getName() %></td>
            <td><%= bb.getAuthor() %></td>
            <td><%= bb.getPrice() %></td>
            <td><%= bb.getQty() %></td>
        </tr>
        <%
    
            }
            al.clear();
        %>
    </table>
    <a href="book.html">Add Book Details</a>
</body>
</html>

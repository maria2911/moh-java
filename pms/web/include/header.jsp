<%@page import="models.UserModel"%>
<% 
if (session.getAttribute("loggedin") == null) {
    response.sendRedirect("/pms/pub/login.jsp");
    return; // for kill session
    }

// casting
UserModel user = (UserModel)session.getAttribute("user");

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="/pms/assets/bootstrap/css/bootstrap.css">
        <title>PMS</title>
    </head>
    <body>
        <h1>Sistem Pengurusan Project - KKM 2019</h1>
        <div align="right">
           <h3>Username: <%= user.getName() %></h3>(<a href="/pms/login?logout">Logout</a>)
        <br> 
        </div>
        


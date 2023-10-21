<%-- 
    Document   : index
    Created on : Oct 20, 2023, 9:32:13 PM
    Author     : jake
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style.css" type="text/css" />
    </head>
    <body>
        <link rel="stylesheet" href="style.css" type="text/css">
        <p>test's</p>
        <div id="topbar">
            <h1>Jake Site</h1>
            <div id="nav">
                <a href="Public?action=goToHome">Home</a>
                
                <p>${pageContext.request.getContextPath()}</p>    
                <c:choose>
                    <c:when test="${loggedin == 'true'}" >
                        <a href="Public?action=logout">Logout</a>
                    </c:when>
                    <c:otherwise>
                        <a href="Public?action=goToLogin">Login</a>
                    </c:otherwise>
                </c:choose>
                
                <a href="Public?action=goToRegister">Register</a>
            </div>
        </div>
        <h1>Hello World!</h1>
    </body>
</html>

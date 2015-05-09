<%-- 
    Document   : VerLista
    Created on : 06-05-2015, 23:36:25
    Author     : Sergioh
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page import="model.ModeloLista" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            body {background-color:#008080}
            p {color:white}
        </style>
    </head>
    
    <body >
        <%
            ModeloLista mlbean1 = (ModeloLista)request.getAttribute("beanlista");     
            out.print(mlbean1.MostrarMusica());              
        %>
        <select class="form-control" >
            <option>1</option>
            <option>2</option>
            <option>3</option>
            <option>4</option>
            <option>5</option>
        </select>
        <select multiple class="form-control">
            <option>1</option>
            <option>2</option>
            <option>3</option>
            <option>4</option>
            <option>5</option>
        </select>

    </body>
</html>

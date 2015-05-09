<%-- 
    Document   : CrearLista
    Created on : 06-05-2015, 23:36:05
    Author     : Sergioh
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nueva Lista de Reproduccion</title

    </head>
    <body>
        <form action ="../ControlLista" method="post">
            <br>    <br>
            Nombre Lista:<input type="text" name="lista"><br>
            <br>
            <input type="submit" value="Crear">
        </form>
    </body>
</html>

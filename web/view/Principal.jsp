<%-- 
    Document   : Principal
    Created on : 06-05-2015, 23:34:09
    Author     : Sergioh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>spotify</title

    </head>
    <body>
        <h3>Listas De Reproduccion.<h3>
        
        <form>
            <input type="button" value="Crear Lista" onClick="window.location.href='view/CrearLista.jsp'">
            <br> </br>
            <input type="button" value="Eliminar Lista" onClick="window.location.href='view/BorrarLista.jsp'">
            <br> </br>
            <input type="button" value="Ver Listas de Reproduccion" onClick="window.location.href='view/VerLista.jsp'">
        </form>
    </body>
</html>

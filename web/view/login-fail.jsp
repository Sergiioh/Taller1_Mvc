
<%@ page import="model.ModeloLogin" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="REFRESH" CONTENT="5;URL=view/login.jsp" >
<title>Login Fail</title>
</head>
<body>
    <%HttpSession sesion=request.getSession();
       out.print("sesion = " +sesion.getAttribute("userId") ); 
    %>
   
<p>Error! usuario o contraseña incorrecta.</p>

<a href="view/login.jsp">Volver al login</a>


</body>
</html>
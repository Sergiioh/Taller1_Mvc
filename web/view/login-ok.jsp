<%@ page import="model.ModeloLista" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login OK</title>
	
</head>
<body>
	<p>Ha ingresado correctamente al sistema!</p>
	<%
	ModeloLista mlbean1 = (ModeloLista)request.getAttribute("bean");
	
	out.print("<b>Bienvenido <br>Usuario: </b>" + mlbean1.getId());
	
	out.print("<b> Seccion <br>Estado: </b>" + mlbean1.isIngreso());
	%>
</body>
</html>
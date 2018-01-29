<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page import="com.maynar.fideliza.webapp.beans.UsuarioBean"%>
<%
	UsuarioBean user = (UsuarioBean) request.getAttribute("usuario");
	if (user == null) {
		user = new UsuarioBean();
		request.setAttribute("usuario", user);
	}
%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link href="css/estilos.css" rel="stylesheet">
<title>Programa fideliza</title>
</head>

<body class="register-form">

	<div class="container">
	    <br>
	    <p class="h1">Seleccione tipo de registro</p>
		<div class="row registroSelect">
	        <div class="col-md-6">
	            <a href="registroCliente" class="btn btn-primary btn-lg btn-block btn-huge">Registro cliente</a>
	        </div>
	        <div class="col-md-6">
	            <a href="registroOperador" class="btn btn-success btn-lg btn-block btn-huge">Resgistro operador</a>
	        </div>
		</div>
	</div>
	<div id="footer">
		<%@ include file="footer.jspf"%>
	</div>
</body>
</html>
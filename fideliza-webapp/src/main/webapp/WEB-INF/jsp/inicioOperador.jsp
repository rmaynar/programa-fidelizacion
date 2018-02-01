<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<title>Programa fideliza</title>
</head>

<body>
	<div id="header">
		<%@ include file="header.jspf"%>
	</div>

	<div class="container">

		<!-- Main component for a primary marketing message or call to action -->
		<div class="jumbotron">
			<h1>Centro de control Operadores</h1>
			<p>Desde esta página puede gestionar sus ofertas y premiar a los clientes</p>
			<p>Acceda al listado de ofertas</p>
			<p>
				<a class="btn btn-lg btn-primary" href="ofertas/listado"
					role="button">Ver ofertas del mes &raquo;</a>
			</p>
		</div>

	</div>
	<!-- /container -->
	<div class="container">
		<div class="row">
			<div class="col-xl-4 col-md-4">
				<button id="consultarPuntos" type="button" class="btn btn-primary">Consultar
					mis puntos</button>
			</div>
			<div class="col-xl-4 col-md-4">
				<div id="puntos" class="alert alert-primary"
					style="visibility: hidden;" role="alert"></div>
			</div>
			<div class="col-xl-4 col-md-4"></div>
		</div>
	</div>
	<div id="footer">
		<%@ include file="footer.jspf"%>
	</div>
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %> 
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Programa fideliza</title>
</head>
<%@page import="java.util.*"%>
<%@page import="com.maynar.fideliza.bom.Oferta"%>
<body>
	<div id="header">
	    <%@ include file="header.jspf" %>
	</div>
	
	<!-- /container -->
	<div class="container">
		<div class="row">
			<h2>Ofertas</h2>
		</div>
		<div class="row">
			<br/>
			<h4>Mis puntos:${puntos}</h4>
		</div>
		<div class="row">
			<ul class="list-group">
				<c:forEach items="${ofertas}" var="oferta">
					<li class="list-group-item">
						<c:out value="${oferta.descripcion}"></c:out>
						<ul class="list-unstyled">
							<li>Puntos necesarios: <c:out value="${oferta.puntos}"></c:out></li>
							<li><button class="btn btn-info comprar" value="${oferta.puntos}">Comprar</button></li>
						</ul>
					</li>
				</c:forEach>
			</ul>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-2.2.4.js"
		integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI="
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
	<script>var misPuntos = ${puntos};</script>
	<script src="<c:url value="/js/acciones.js" />"></script>
</body>
</html>
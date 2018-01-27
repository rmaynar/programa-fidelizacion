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
<!-- Custom styles for this template -->
<link
	href="https://getbootstrap.com/docs/4.0/examples/sign-in/signin.css"
	rel="stylesheet">
<title>Programa fideliza</title>
</head>

<body class="text-center">
	<form:form modelAttribute="usuario" class="form-signin" method="POST"
		action="inicio">
		<!--  src="https://getbootstrap.com/assets/brand/bootstrap-solid.svg"-->
		<img class="mb-4"
			src="http://www.wayfindingpro.com/wp-content/uploads/2014/06/iconMembershipClub.svg"
			alt="">
		<h1 class="h3 mb-3 font-weight-normal">Inicie sesión</h1>
		<label for="inputEmail" class="sr-only">Email</label>
		<form:input type="email" id="inputEmail" path="email"
			class="form-control" placeholder="Email address" required="true"
			autofocus="true" />
		<label for="inputPassword" class="sr-only">Password</label>
		<form:input type="password" id="inputPassword" path="password"
			class="form-control" placeholder="Password" required="true" />
		<div class="checkbox mb-3">
			<label> <input type="checkbox" value="remember-me">
				Recordar datos
			</label>
		</div>
		<button class="btn btn-lg btn-primary btn-block" type="submit">Iniciar
			sesión</button>
		<div class="form-group">
			<div class="col-md-12 control">
				<div
					style="border-top: 1px solid #888; padding-top: 15px; font-size: 85%">
					No tengo cuenta! <a href="registro"> Regístrate aquí </a>
				</div>
			</div>
		</div>
		<p class="mt-5 mb-3 text-muted">&copy; Raúl Maynar / 2017-2018</p>
	</form:form>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>
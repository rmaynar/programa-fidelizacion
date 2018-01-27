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
<title>Programa fideliza</title>
</head>

<body class="text-center">
	
	<form:form class="form-horizontal" modelAttribute="usuario" action='registro' method="POST">
	  <fieldset>
	    <div id="legend">
	      <legend class="">Registro de usuario</legend>
	    </div>
	    <div class="control-group">
	      <!-- Username -->
	      <label class="control-label"  for="username">Nombre de usuario</label>
	      <div class="controls">
	        <form:input type="text" id="username" name="usuario" path="usuario" placeholder="" class="input-xlarge"/>
	        <p class="help-block">El nombre de usuario puede contener letras y números sin espacios</p>
	      </div>
	    </div>
	 
	    <div class="control-group">
	      <!-- E-mail -->
	      <label class="control-label" for="email">E-mail</label>
	      <div class="controls">
	        <form:input type="text" id="email" name="email" path="email" placeholder="" class="input-xlarge"/>
	        <p class="help-block">Por favor introduzca el E-mail</p>
	      </div>
	    </div>
	 
	    <div class="control-group">
	      <!-- Password-->
	      <label class="control-label" for="password">Password</label>
	      <div class="controls">
	        <form:input type="password" id="password" path="password" name="password" placeholder="" class="input-xlarge"/>
	        <p class="help-block">El password debe contener al menos 4 caracteres</p>
	      </div>
	    </div>
	 
	    <div class="control-group">
	      <!-- Password -->
	      <label class="control-label"  for="password_confirm">Password (Confirm)</label>
	      <div class="controls">
	        <input type="password" id="password_confirm"  name="password_confirm" placeholder="" class="input-xlarge"/>
	        <p class="help-block">Por favor confirme el password</p>
	      </div>
	    </div>
	 
	    <div class="control-group">
	      <!-- Button -->
	      <div class="controls">
	        <button class="btn btn-success">Registrarse</button>
	      </div>
	    </div>
	  </fieldset>
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
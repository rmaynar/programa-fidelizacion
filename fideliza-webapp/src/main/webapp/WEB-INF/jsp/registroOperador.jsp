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

	<form:form class="form-horizontal" modelAttribute="operador"
		action='registroOperador' method="POST">
		<fieldset>
			<div id="legend">
				<legend class="">Registro de operador</legend>
			</div>
			<div class="control-group">
				<!-- Username -->
				<label class="control-label" for="username">Nombre de
					usuario</label>
				<div class="controls">
					<form:input type="text" id="username" name="usuario" path="datosUsuario.usuario"
						placeholder="Nombre de usuario" class="input-xlarge" required="true" />
					<p class="help-block text-muted">El nombre de usuario puede contener
						letras y números sin espacios</p>
				</div>
			</div>

			<div class="control-group">
				<!-- E-mail -->
				<label class="control-label" for="email">E-mail</label>
				<div class="controls">
					<form:input type="text" id="email" name="email" path="datosUsuario.email"
						placeholder="e-mail" class="input-xlarge" required="true" />
					<p class="help-block text-muted">Por favor introduzca el E-mail</p>
				</div>
			</div>

			<div class="control-group">
				<!-- Password-->
				<label class="control-label" for="password">Password</label>
				<div class="controls">
					<form:input type="password" id="password" path="datosUsuario.password"
						name="password" placeholder="Password" 
						required="true" />
					<p class="help-block text-muted">El password debe contener al menos 4
						caracteres</p>
				</div>
			</div>

			<div class="control-group">
				<!-- Password -->
				<label class="control-label" for="password_confirm">Password
					(Confirm)</label>
				<div class="controls">
					<input type="password" id="password_confirm"
						name="password_confirm" placeholder="Repita Password" 
						required="true" />
					<p class="help-block text-muted text-muted">Por favor confirme el password</p>
				</div>
			</div>
			
			<div class="ciff-class control-group">
				<!-- CIF -->
				<label class="control-label" for="cif">CIF
					</label>
				<div class="controls">
					<input type="password" id="cif"
						name="cif" placeholder="" path="cif" 
						required="true" />
					<p class="help-block text-muted">Introduzca el cif</p>
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



	<div id="footer">
		<%@ include file="footer.jspf"%>
	</div>
</body>
</html>
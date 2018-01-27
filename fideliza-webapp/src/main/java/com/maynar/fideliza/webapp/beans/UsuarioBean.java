package com.maynar.fideliza.webapp.beans;

import org.springframework.context.annotation.Scope;

public class UsuarioBean {

	private String usuario;
	private String password;
	private String email;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}

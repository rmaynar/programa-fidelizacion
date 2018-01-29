package com.maynar.fideliza.webapp.beans;

public class ClienteBean {

	UsuarioBean datosUsuario;
	String puntos;
	public UsuarioBean getDatosUsuario() {
		return datosUsuario;
	}
	public void setDatosUsuario(UsuarioBean datosUsuario) {
		this.datosUsuario = datosUsuario;
	}
	public String getPuntos() {
		return puntos;
	}
	public void setPuntos(String puntos) {
		this.puntos = puntos;
	}
	public ClienteBean(UsuarioBean datosUsuario, String puntos) {
		super();
		this.datosUsuario = datosUsuario;
		this.puntos = puntos;
	}
	public ClienteBean() {
		super();
	}
	
	
}

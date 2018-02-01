package com.maynar.fideliza.webapp.beans;

public class OperadorBean {

	UsuarioBean datosUsuario;
	String cif;
	public UsuarioBean getDatosUsuario() {
		return datosUsuario;
	}
	public void setDatosUsuario(UsuarioBean datosUsuario) {
		this.datosUsuario = datosUsuario;
	}
	
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public OperadorBean(UsuarioBean datosUsuario, String cif) {
		super();
		this.datosUsuario = datosUsuario;
		this.cif = cif;
	}
	public OperadorBean() {
		super();
	}
	
	
}

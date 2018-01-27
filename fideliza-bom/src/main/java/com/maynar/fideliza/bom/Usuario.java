package com.maynar.fideliza.bom;

public class Usuario {
	
	private String id;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Usuario() {

	};

	public Usuario(String usuario, String password, String email) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.email = email;
	}

}

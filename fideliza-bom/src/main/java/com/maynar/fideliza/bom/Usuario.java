package com.maynar.fideliza.bom;

public class Usuario {
	
	private String id;
	private String usuario;
	private String password;
	private String email;
	private String tipo;

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Usuario() {

	};

	public Usuario(String id) {
		super();
		this.id = id;
	}

	public Usuario(String usuario, String password, String email) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.email = email;
	}
	
	public Usuario(String usuario, String password, String email, String tipo) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.email = email;
		this.tipo = tipo;
	}

}

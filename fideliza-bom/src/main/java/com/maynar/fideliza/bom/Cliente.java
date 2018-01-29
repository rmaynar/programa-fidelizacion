package com.maynar.fideliza.bom;

public class Cliente {

	private String id;
	private String id_usuario;
	private String puntos = "0";

	public String getPuntos() {
		return puntos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}

	public void setPuntos(String puntos) {
		this.puntos = puntos;
	}

	public Cliente(String id) {
		super();
		this.id = id;
	}

	public Cliente() {
		super();
	}
	
	
}

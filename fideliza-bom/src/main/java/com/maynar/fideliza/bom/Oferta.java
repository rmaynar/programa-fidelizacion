package com.maynar.fideliza.bom;

import java.util.Date;

public class Oferta {
	private String descripcion;
	private Date caducidad;
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getCaducidad() {
		return caducidad;
	}
	public void setCaducidad(Date caducidad) {
		this.caducidad = caducidad;
	}
	public Oferta(String descripcion, Date caducidad) {
		super();
		this.descripcion = descripcion;
		this.caducidad = caducidad;
	}
	public Oferta() {
		super();
	}
	
	
}

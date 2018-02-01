package com.maynar.fideliza.dao;

import com.maynar.fideliza.bom.Usuario;


public interface IUsuarioDao {
	public Usuario obtenerUsuario(Usuario usuario);
	public Usuario obtenerUsuarioEmail(String email);
	public Usuario crearUsuario(Usuario usuario);
}

package com.maynar.fideliza.dao;

import com.maynar.fideliza.bom.Cliente;
import com.maynar.fideliza.bom.Usuario;


public interface IUsuarioDao {
	public Usuario obtenerUsuario(Usuario usuario);
	public Usuario crearUsuario(Usuario usuario);
	public Cliente crearCliente(Cliente cliente);
}

package com.maynar.fideliza.dao;

import com.maynar.fideliza.bom.Cliente;
import com.maynar.fideliza.bom.Usuario;


public interface IClienteDao {
	public Cliente obtenerCliente(Cliente cliente);
	public Cliente obtenerClienteUsuario(Usuario user);
	public Cliente guardarCliente(Cliente cliente);
}

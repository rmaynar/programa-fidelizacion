package com.maynar.fideliza.services;

import com.maynar.fideliza.bom.Cliente;
import com.maynar.fideliza.bom.Usuario;

public interface IClienteService {

	public Cliente registrarCliente(Cliente cliente);
	public Cliente obtenerCliente(Cliente cliente);
	public Cliente obtenerCliente(Usuario usuario);
	
}

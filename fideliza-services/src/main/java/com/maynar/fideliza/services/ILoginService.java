package com.maynar.fideliza.services;

import com.maynar.fideliza.bom.Cliente;
import com.maynar.fideliza.bom.Operador;
import com.maynar.fideliza.bom.Usuario;

public interface ILoginService {

	public Usuario login(Usuario usuario);
	public Usuario logout(Usuario usuario);
	public Usuario register(Usuario usuario);
	public Cliente registrarCliente(Cliente cliente);
	public Operador registrarOperador(Operador operador);
	
}

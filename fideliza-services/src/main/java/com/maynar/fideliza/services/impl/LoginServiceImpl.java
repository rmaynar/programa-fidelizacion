package com.maynar.fideliza.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maynar.fideliza.bom.Cliente;
import com.maynar.fideliza.bom.Operador;
import com.maynar.fideliza.bom.Usuario;
import com.maynar.fideliza.dao.IClienteDao;
import com.maynar.fideliza.dao.IOperadorDao;
import com.maynar.fideliza.dao.IUsuarioDao;
import com.maynar.fideliza.services.ILoginService;
@Service
public class LoginServiceImpl implements ILoginService{
	@Autowired
	private IUsuarioDao usuarioDao;
	@Autowired
	private IOperadorDao operadorDao;
	@Autowired
	private IClienteDao clienteDao;
	
	public Usuario login(Usuario usuario) {
		Usuario user = usuarioDao.obtenerUsuario(usuario);
		return user;
	}

	public Usuario register(Usuario usuario) {
		Usuario user = usuarioDao.crearUsuario(usuario);
		return user;
	}
	
	public Cliente registrarCliente(Cliente cliente) {
		cliente = clienteDao.guardarCliente(cliente);
		return cliente;
	}

	public Operador registrarOperador(Operador operador) {
		operador = operadorDao.crearOperador(operador);
		return operador;
	}

}

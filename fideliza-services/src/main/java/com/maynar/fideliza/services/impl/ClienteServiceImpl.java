package com.maynar.fideliza.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maynar.fideliza.bom.Cliente;
import com.maynar.fideliza.bom.Usuario;
import com.maynar.fideliza.dao.IClienteDao;
import com.maynar.fideliza.services.IClienteService;
@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteDao clienteDao;
	
	public Cliente registrarCliente(Cliente cliente) {
		return clienteDao.crearCliente(cliente);
	}

	public Cliente obtenerCliente(Cliente cliente) {
		return clienteDao.obtenerCliente(cliente);
	}

	public Cliente obtenerCliente(Usuario usuario) {
		return clienteDao.obtenerClienteUsuario(usuario);
	}

	

}

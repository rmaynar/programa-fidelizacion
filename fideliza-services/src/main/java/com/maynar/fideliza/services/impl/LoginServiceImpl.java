package com.maynar.fideliza.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maynar.fideliza.bom.Cliente;
import com.maynar.fideliza.bom.Usuario;
import com.maynar.fideliza.dao.IUsuarioDao;
import com.maynar.fideliza.services.ILoginService;
@Service
public class LoginServiceImpl implements ILoginService{
	@Autowired
	private IUsuarioDao usuarioDao;
	
	public Usuario login(Usuario usuario) {
		Usuario user = usuarioDao.obtenerUsuario(usuario);
		return user;
	}

	public Usuario logout(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario register(Usuario usuario) {
		Usuario user = usuarioDao.crearUsuario(usuario);
		return user;
	}
	
	public Cliente registrarCliente(Cliente cliente) {
		cliente = usuarioDao.crearCliente(cliente);
		return cliente;
	}

}

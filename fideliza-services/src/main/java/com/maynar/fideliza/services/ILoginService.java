package com.maynar.fideliza.services;

import com.maynar.fideliza.bom.Usuario;

public interface ILoginService {

	public Usuario login(Usuario usuario);
	public Usuario logout(Usuario usuario);
	
}
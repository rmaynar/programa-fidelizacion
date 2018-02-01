package com.maynar.fideliza.dao;

import com.maynar.fideliza.bom.Operador;
import com.maynar.fideliza.bom.Usuario;


public interface IOperadorDao {
	public Operador obtenerOperador(Operador operador);
	public Operador obtenerOperadorUsuario(Usuario user);
	public Operador crearOperador(Operador operador);
}

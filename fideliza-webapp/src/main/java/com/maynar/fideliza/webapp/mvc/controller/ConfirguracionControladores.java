package com.maynar.fideliza.webapp.mvc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.maynar.fideliza.webapp.beans.UsuarioBean;

/**
 * Permite que todos los controladores gestionados por
 * RequestMappingHandlerMapping tengan esta config comun dentro del paquete
 * indicado
 * 
 * @author rmaynar
 *
 */
@ControllerAdvice("com.maynar.fideliza.webapp.controller")
@SessionAttributes("usuario")
public class ConfirguracionControladores {
	// Asociado a todas las requests
	@ModelAttribute("usuario")
	public UsuarioBean usuario() {
		return new UsuarioBean();
	}
}

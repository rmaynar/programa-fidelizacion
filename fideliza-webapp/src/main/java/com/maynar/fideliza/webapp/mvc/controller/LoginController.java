package com.maynar.fideliza.webapp.mvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.maynar.fideliza.bom.Usuario;
import com.maynar.fideliza.services.ILoginService;
import com.maynar.fideliza.webapp.beans.UsuarioBean;

@Controller
public class LoginController {

	@Autowired
	private ILoginService loginService;
	
	@RequestMapping(path="/login", method = RequestMethod.GET)
	public String iniciarFormulario(Map<String,Object> model) {
		/** Esto lo realiza el ConfiguracionControladores
		//servicio.obtenerGeneros();
		model.put("genero", new String[] {"Masculino","Femenino"});
		**/
		return "login";
	}
	
	@RequestMapping(path="/inicio", method = RequestMethod.GET)
	public String iniciarMenu(Map<String,Object> model) {
		/** Esto lo realiza el ConfiguracionControladores
		//servicio.obtenerGeneros();
		model.put("genero", new String[] {"Masculino","Femenino"});
		**/
		return "login";
	}
	
	@RequestMapping(path="/inicio", method = RequestMethod.POST)
	public String procesarFormulario(@ModelAttribute UsuarioBean usuario) {
		String returnView = "login";
		
		Usuario user = new Usuario(usuario.getUsuario(), usuario.getPassword(), usuario.getEmail());
		user = loginService.login(user);
		if(user!=null) {
			returnView = "inicio";
		}
		return returnView;
	}
	
}

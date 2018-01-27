package com.maynar.fideliza.webapp.mvc.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maynar.fideliza.bom.Usuario;
import com.maynar.fideliza.services.ILoginService;
import com.maynar.fideliza.webapp.beans.UsuarioBean;

@Controller
public class LoginController {

	@Autowired
	private ILoginService loginService;
	
	
	@RequestMapping(path="/login", method = RequestMethod.GET)
	public String iniciarFormulario(Map<String,Object> model) {
		return "login";
	}
	
	
	@RequestMapping(path="/inicio", method = RequestMethod.POST)
	public String procesarFormulario(@ModelAttribute UsuarioBean usuario, HttpServletRequest request) {
		String returnView = "login";
		
		Usuario user = new Usuario(usuario.getUsuario(), usuario.getPassword(), usuario.getEmail());
		user = loginService.login(user);
		if(user!=null) {
			returnView = "inicio";
			usuario.setUsuario(user.getUsuario());
			request.getSession().setAttribute("usuario", usuario);
		}
		return returnView;
	}
	
	/**
	 * Consultar puntos
	 * @param model
	 * @return
	 */
	@RequestMapping(path="/consultaPuntos", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody public String consultarPuntos() {
		return "{\"puntos\":100}";
	}
	
	@RequestMapping(path="/registro", method = RequestMethod.GET)
	public String iniciarRegistro(Map<String,Object> model) {
		return "registro";
	}
	
	@RequestMapping(path="/registro", method = RequestMethod.POST)
	public String procesarRegistro(@ModelAttribute UsuarioBean usuario) {
		String returnView = "login";
		
		Usuario user = new Usuario(usuario.getUsuario(), usuario.getPassword(), usuario.getEmail());
		user = loginService.register(user);
		if(user!=null) {
			returnView = "inicio";
		}
		return returnView;
	}
	
}

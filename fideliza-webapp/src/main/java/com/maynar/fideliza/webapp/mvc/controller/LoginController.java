package com.maynar.fideliza.webapp.mvc.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maynar.fideliza.bom.Cliente;
import com.maynar.fideliza.bom.Usuario;
import com.maynar.fideliza.services.ILoginService;
import com.maynar.fideliza.webapp.beans.ClienteBean;
import com.maynar.fideliza.webapp.beans.UsuarioBean;

@Controller
public class LoginController {

	@Autowired
	private ILoginService loginService;
	
	@ModelAttribute("cliente")
	public ClienteBean cliente() {
		return new ClienteBean();
	}
	
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
			usuario.setId(user.getId());
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
	
	@RequestMapping(path="/registroCliente", method = RequestMethod.GET)
	public String registroCliente(Map<String,Object> model) {
		return "registroCliente";
	}
	
	@RequestMapping(path="/registroCliente", method = RequestMethod.POST)
	public String registroCliente(@ModelAttribute ClienteBean cliente, HttpSession session) {
		String returnView = "login";
		
		Usuario user = new Usuario(cliente.getDatosUsuario().getUsuario(), cliente.getDatosUsuario().getPassword(), cliente.getDatosUsuario().getEmail(), "cliente");
		user = loginService.register(user);
		if(user!=null) {
			Cliente clienteEntity = new Cliente();
			clienteEntity.setId_usuario(user.getId());
			clienteEntity.setPuntos(cliente.getPuntos());
			loginService.registrarCliente(clienteEntity);
			session.setAttribute("usuario", cliente.getDatosUsuario());
			returnView = "inicio";
		}
		return returnView;
	}
	
	@RequestMapping(path="/registroOperador", method = RequestMethod.GET)
	public String registroOperador(Map<String,Object> model) {
		return "registroCliente";
	}
	
	@RequestMapping(path="/registroOperador", method = RequestMethod.POST)
	public String registroOperador(@ModelAttribute UsuarioBean usuario) {
		String returnView = "login";
		
		Usuario user = new Usuario(usuario.getUsuario(), usuario.getPassword(), usuario.getEmail());
		user = loginService.register(user);
		if(user!=null) {
			returnView = "inicio";
		}
		return returnView;
	}
	
}

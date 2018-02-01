package com.maynar.fideliza.webapp.mvc.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.maynar.fideliza.bom.Cliente;
import com.maynar.fideliza.bom.Operador;
import com.maynar.fideliza.bom.Usuario;
import com.maynar.fideliza.services.ILoginService;
import com.maynar.fideliza.webapp.beans.ClienteBean;
import com.maynar.fideliza.webapp.beans.OperadorBean;
import com.maynar.fideliza.webapp.beans.UsuarioBean;

@Controller
public class LoginController {

	@Autowired
	private ILoginService loginService;

	
	@ModelAttribute("cliente")
	public ClienteBean cliente() {
		return new ClienteBean();
	}
	
	@ModelAttribute("operador")
	public OperadorBean operador() {
		return new OperadorBean();
	}
	
	@RequestMapping(path="/login", method = RequestMethod.GET)
	public String iniciarFormulario(Map<String,Object> model) {
		return "login";
	}
	
	
	@RequestMapping(path="/inicio", method = RequestMethod.POST)
	public String procesarFormulario(@ModelAttribute UsuarioBean usuario, HttpSession session) {
		String returnView = "login";
		
		Usuario user = new Usuario(usuario.getUsuario(), usuario.getPassword(), usuario.getEmail());
		user = loginService.login(user);
		if(user!=null) {
			if(user.getTipo()!=null&&user.getTipo().equals("cliente")) {//devolvemos vista de cliente
				returnView = "inicio";
			}else {
				returnView = "inicioOperador";
			}
			
			usuario.setUsuario(user.getUsuario());
			usuario.setId(user.getId());
			usuario.setTipo(user.getTipo());
			usuario.setPassword("");
			session.setAttribute("usuario", usuario);
		}
		return returnView;
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
			clienteEntity.setId_usuario(user.getEmail());
			loginService.registrarCliente(clienteEntity);
			cliente.getDatosUsuario().setTipo("cliente");
			session.setAttribute("usuario", cliente.getDatosUsuario());
			returnView = "inicio";
		}
		return returnView;
	}
	
	@RequestMapping(path="/registroOperador", method = RequestMethod.GET)
	public String registroOperador(Map<String,Object> model) {
		return "registroOperador";
	}
	
	@RequestMapping(path="/registroOperador", method = RequestMethod.POST)
	public String registroOperador(@ModelAttribute OperadorBean operador, HttpSession session) {
		String returnView = "login";
		operador.getDatosUsuario().setTipo("operador");
		Usuario user = new Usuario(operador.getDatosUsuario().getUsuario(), operador.getDatosUsuario().getPassword(), operador.getDatosUsuario().getEmail(),operador.getDatosUsuario().getTipo());
		user = loginService.register(user);
		if(user!=null) {
			Operador operadorEntity = new Operador();
			operadorEntity.setId_usuario(user.getId());
			operadorEntity.setCif(operador.getCif());
			loginService.registrarOperador(operadorEntity);
			session.setAttribute("usuario", operador.getDatosUsuario());
			returnView = "inicioOperador";
		}
		return returnView;
	}
	
	@RequestMapping(path="/logout", method = RequestMethod.GET)
	public String logout(Map<String,Object> model, HttpSession sesion) {
		sesion.removeAttribute("usuario");
		return "login";
	}
}

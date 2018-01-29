package com.maynar.fideliza.webapp.mvc.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.maynar.fideliza.bom.Cliente;
import com.maynar.fideliza.bom.Usuario;
import com.maynar.fideliza.services.IClienteService;
import com.maynar.fideliza.services.IOfertasService;
import com.maynar.fideliza.webapp.beans.UsuarioBean;

@Controller
public class InicioController {

	@Autowired
	private IOfertasService ofertasService;
	
	@Autowired
	private IClienteService clienteService;
	
	@RequestMapping(path="/ofertas/listado", method = RequestMethod.GET)
	public String  listarOfertas(Model model, HttpSession sesion) {
		/** Esto lo realiza el ConfiguracionControladores
		//servicio.obtenerGeneros();
		model.put("genero", new String[] {"Masculino","Femenino"});
		**/
		UsuarioBean usuario = (UsuarioBean)sesion.getAttribute("usuario");
		Cliente cliente = clienteService.obtenerCliente(new Usuario(usuario.getId()));
//		model.addAttribute("lasofertas", new String[] {"Oferta1","Oferta2","Oferta3"});
		model.addAttribute("puntos", cliente.getPuntos());
		model.addAttribute("ofertas", ofertasService.consultarTodas());
//		model.put("ofertas", ofertasService.consultarTodas());
		return "ofertas";
	}
	 
	@RequestMapping(path="/inicio", method = RequestMethod.GET)
	public String iniciarMenu(Map<String,Object> model, HttpServletRequest request) {
		//comprobamos que se haya logado el usuario
		UsuarioBean usuarioLogueado = (UsuarioBean)request.getSession().getAttribute("usuario");
		if(usuarioLogueado!=null) {
			return "inicio";
		}else {
			return "login";
		}
		
	}
	
}

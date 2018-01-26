package com.maynar.fideliza.webapp.mvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;

import com.maynar.fideliza.services.IOfertasService;

@Controller
public class InicioController {

	@Autowired
	private IOfertasService ofertasService;
	
	@Autowired
	private View listadoOfertas;
	
	@RequestMapping(path="/ofertas/listado", method = RequestMethod.GET)
	public String  listarOfertas(Map<String,Object> model) {
		/** Esto lo realiza el ConfiguracionControladores
		//servicio.obtenerGeneros();
		model.put("genero", new String[] {"Masculino","Femenino"});
		**/
		model.put("ofertas", new String[] {"Oferta1","Oferta2","Oferta3"});
//		model.addObject("ofertas", ofertasService.consultarTodas());
//		model.put("ofertas", ofertasService.consultarTodas());
		return "ofertas";
	}
	 
	@RequestMapping(path="/inicio", method = RequestMethod.GET)
	public String iniciarMenu(Map<String,Object> model) {
		return "inicio";
	}
	
}

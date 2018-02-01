package com.maynar.fideliza.webapp.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maynar.fideliza.bom.Cliente;
import com.maynar.fideliza.bom.Usuario;
import com.maynar.fideliza.dao.IUsuarioDao;
import com.maynar.fideliza.services.IClienteService;

@Controller
@RequestMapping(path = "/gestionpuntos")
public class AdministracionPuntos {

	@Autowired
	private IUsuarioDao usuarioDao;

	@Autowired
	private IClienteService clienteService;

	/**
	 * GET
	 * @return
	 */
	@RequestMapping(path = "/usuario", produces=MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	@ResponseBody public String obtenerPuntosCliente(@RequestParam("email") String email) {
		
		Usuario user = new Usuario();
		user.setEmail(email);
		user = usuarioDao.obtenerUsuarioEmail(email);
		Cliente cliente = clienteService.obtenerCliente(user);
//		UsuarioBean beanUsuario = new  UsuarioBean();
//		beanUsuario.setEmail(email);
//		ClienteBean clienteOutput = new ClienteBean(beanUsuario,cliente.getPuntos());
		return "{\"puntos\":\""+cliente.getPuntos()+"\"}";
	}
	
	/**
	 * Recibe una persona en json, le cambia el nombre y devuelve en json
	 * @param persona
	 * @param nombreNuevo
	 * @return
	 */
	@RequestMapping(path = "/usuario", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
	@ResponseBody 
	public ResponseEntity<String> modificarPuntos(@RequestBody Cliente cliente) {
		HttpStatus estado = HttpStatus.OK;
		//obtenemos el cliente a partir de sus datos
		Cliente cliente_modificado = clienteService.obtenerCliente(cliente);
		String msg_respuesta = "{\"resultado\":\"OK\"}";
		if(cliente_modificado==null) {
			estado = HttpStatus.FORBIDDEN;
			cliente_modificado = new Cliente();
			msg_respuesta = "{\"resultado\":\"ERROR: Cliente desconocido\"}";
		}else {
			//modificamos el cliente
			cliente_modificado.setPuntos(Integer.toString(Integer.parseInt(cliente_modificado.getPuntos())+Integer.parseInt(cliente.getPuntos())));
			//guardamos cambios
			clienteService.registrarCliente(cliente_modificado);
		}
		ResponseEntity<String> respuesta = new ResponseEntity<String>(msg_respuesta, estado);
		
		return respuesta;
	}
}

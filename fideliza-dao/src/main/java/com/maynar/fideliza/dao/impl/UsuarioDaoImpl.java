
package com.maynar.fideliza.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.maynar.fideliza.bom.Usuario;
import com.maynar.fideliza.dao.IUsuarioDao;
@Service
public class UsuarioDaoImpl implements IUsuarioDao {

	@Autowired
    MongoTemplate mongoTemplate;
 
    final String COLLECTION = "usuario";
	
	private static Usuario usuario = new Usuario("rmaynars","atsistemas","rmaynar@atsistemas.com");
	private static Usuario[] usuarios = {
			new Usuario("rmaynars","atsistemas","rmaynar@atsistemas.com"),
			new Usuario("pepe","atsistemas","pepe@atsistemas.com")};
	
	
	public Usuario obtenerUsuario(Usuario usuario) {
		
//		Usuario user = null;
//		//hacemos query del usuario
//		boolean encontrado = false;
//		for(int i = 0; i<usuarios.length && !encontrado; i++) {
//			if(usuario.getEmail().equals(usuarios[i].getEmail())) {//se ha encontrado email en la bbdd
//				if(usuario.getPassword().equals(usuarios[i].getPassword())) { //coincide password
//					encontrado = true;
//					user = usuarios[i];
//				}
//			}
//		}
//		return user;
		
		Query query = new Query(Criteria.where("email").is(usuario.getEmail()).and("password").is(usuario.getPassword()));
        return mongoTemplate.findOne(query, Usuario.class, COLLECTION);
		
	}


	public Usuario crearUsuario(Usuario usuario) {
		mongoTemplate.save(usuario);
		return usuario;
	}

}

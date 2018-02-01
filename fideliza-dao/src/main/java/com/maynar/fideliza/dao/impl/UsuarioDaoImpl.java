
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
 
    final String COLLECTION_USUARIO = "usuario";
	
	
	public Usuario obtenerUsuario(Usuario usuario) {
		
		Query query = new Query(Criteria.where("email").is(usuario.getEmail()).and("password").is(usuario.getPassword()));
        return mongoTemplate.findOne(query, Usuario.class, COLLECTION_USUARIO);
		
	}


	public Usuario crearUsuario(Usuario usuario) {
		mongoTemplate.save(usuario);
		return usuario;
	}


	public Usuario obtenerUsuarioEmail(String email) {
		Query query = new Query(Criteria.where("email").is(email));
        return mongoTemplate.findOne(query, Usuario.class, COLLECTION_USUARIO);
	}

}

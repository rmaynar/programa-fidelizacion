package com.maynar.fideliza.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.maynar.fideliza.bom.Operador;
import com.maynar.fideliza.bom.Usuario;
import com.maynar.fideliza.dao.IOperadorDao;

@Service
public class OperadorDaoImpl implements IOperadorDao {

	@Autowired
    MongoTemplate mongoTemplate;
 
    final String COLLECTION_OPERADOR = "operador";
    
	public Operador obtenerOperador(Operador operador) {
		Query query = new Query(Criteria.where("id_usuario").is(operador.getId()));
        return mongoTemplate.findOne(query, Operador.class, COLLECTION_OPERADOR);
	}

	public Operador obtenerOperadorUsuario(Usuario user) {
		Query query = new Query(Criteria.where("id_usuario").is(user.getId()));
        return mongoTemplate.findOne(query, Operador.class, COLLECTION_OPERADOR);
	}

	public Operador crearOperador(Operador operador) {
		mongoTemplate.save(operador);
		return operador;
	}

}

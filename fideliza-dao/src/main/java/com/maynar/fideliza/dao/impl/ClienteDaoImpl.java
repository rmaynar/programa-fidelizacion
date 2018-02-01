package com.maynar.fideliza.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.maynar.fideliza.bom.Cliente;
import com.maynar.fideliza.bom.Usuario;
import com.maynar.fideliza.dao.IClienteDao;

@Service
public class ClienteDaoImpl implements IClienteDao {

	
	@Autowired
    MongoTemplate mongoTemplate;
 
    final String COLLECTION_CLIENTE = "cliente";

	public Cliente obtenerCliente(Cliente cliente) {
		Query query = new Query(Criteria.where("id_usuario").is(cliente.getId_usuario()));
        return mongoTemplate.findOne(query, Cliente.class, COLLECTION_CLIENTE);
	}

	public Cliente guardarCliente(Cliente cliente) {
		mongoTemplate.save(cliente);
		return cliente;
	}

	public Cliente obtenerClienteUsuario(Usuario user) {
		Query query = new Query(Criteria.where("id_usuario").is(user.getId()));
        return mongoTemplate.findOne(query, Cliente.class, COLLECTION_CLIENTE);
	}


}

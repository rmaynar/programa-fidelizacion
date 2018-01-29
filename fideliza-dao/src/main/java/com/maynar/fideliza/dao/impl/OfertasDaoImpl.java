package com.maynar.fideliza.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.maynar.fideliza.bom.Oferta;
import com.maynar.fideliza.dao.IOfertasDao;
@Service
public class OfertasDaoImpl implements IOfertasDao {

	@Autowired
    MongoTemplate mongoTemplate;
 
    final String COLLECTION = "ofertas";
	
	
	public List<Oferta> obtenerTodasOfertas() {
		return mongoTemplate.findAll(Oferta.class, COLLECTION);
	}

	public List<Oferta> obtenerOfertasMes(Date fecha) {
		Query query = new Query(Criteria.where("caducidad").gte(fecha));
        return mongoTemplate.find(query, Oferta.class, COLLECTION);
	}

}

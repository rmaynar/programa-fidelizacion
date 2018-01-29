package com.maynar.fideliza.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maynar.fideliza.bom.Oferta;
import com.maynar.fideliza.dao.IOfertasDao;
import com.maynar.fideliza.services.IOfertasService;
@Service
public class OfertasServiceImpl implements IOfertasService {
	
//	private static Oferta[] ofertas = {new Oferta("Bahamas 2x1", new Date()),new Oferta("República dominicana 2x1", new Date())};
	
	@Autowired
	IOfertasDao ofertasDao;
	
	public List<Oferta> consultarTodas() {
		
		List<Oferta> ofertas = ofertasDao.obtenerTodasOfertas();
		return ofertas;
	}

}

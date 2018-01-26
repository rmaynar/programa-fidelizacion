package com.maynar.fideliza.services.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.maynar.fideliza.bom.Oferta;
import com.maynar.fideliza.services.IOfertasService;
@Service
public class OfertasServiceImpl implements IOfertasService {
	
	private static Oferta[] ofertas = {new Oferta("Bahamas 2x1", new Date()),new Oferta("República dominicana 2x1", new Date())};
	
	public List<Oferta> consultarTodas() {
		
		return new ArrayList<Oferta>(Arrays.asList(ofertas));
	}

}

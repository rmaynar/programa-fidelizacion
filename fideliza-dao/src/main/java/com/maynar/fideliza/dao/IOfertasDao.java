package com.maynar.fideliza.dao;

import java.util.Date;
import java.util.List;

import com.maynar.fideliza.bom.Oferta;

public interface IOfertasDao {
	public List<Oferta> obtenerTodasOfertas();
	public List<Oferta> obtenerOfertasMes(Date fecha);
}

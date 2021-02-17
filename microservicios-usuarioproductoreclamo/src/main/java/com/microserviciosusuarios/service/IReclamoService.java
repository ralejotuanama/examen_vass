package com.microserviciosusuarios.service;

import java.util.List;

import com.microserviciosusuarios.model.Reclamo;



public interface IReclamoService {

	
	  Reclamo save(Reclamo reclamo) ;
		Reclamo update(Reclamo reclamo);
		List<Reclamo> FindAll();
		Reclamo FindById(Integer id);
		void Delete(Integer id);
	
	
}

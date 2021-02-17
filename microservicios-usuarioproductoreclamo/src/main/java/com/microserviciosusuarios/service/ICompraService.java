package com.microserviciosusuarios.service;

import java.util.List;


import com.microserviciosusuarios.model.Compra;


public interface ICompraService {

	Compra registrarNuevo(Compra compra);
	
	
	
		List<Compra> FindAll();
		Compra FindById(Integer id);
		void Delete(Integer id);
}

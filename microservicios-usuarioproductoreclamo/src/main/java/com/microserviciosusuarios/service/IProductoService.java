package com.microserviciosusuarios.service;

import java.util.List;


import com.microserviciosusuarios.model.Producto;

public interface IProductoService {
	
	   Producto save(Producto producto) ;
		Producto update(Producto producto);
		List<Producto> FindAll();
		Producto FindById(Integer id);
		void Delete(Integer id);
		

}

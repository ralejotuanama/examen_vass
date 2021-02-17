package com.microserviciosusuarios.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microserviciosusuarios.model.Producto;
import com.microserviciosusuarios.repo.IProductoRepo;
import com.microserviciosusuarios.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	private IProductoRepo repo;

	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return repo.save(producto);
	}

	@Override
	public Producto update(Producto producto) {
		// TODO Auto-generated method stub
		return repo.save(producto);
	}

	@Override
	public List<Producto> FindAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Producto FindById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public void Delete(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}

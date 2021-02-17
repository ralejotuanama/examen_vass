package com.microserviciosusuarios.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microserviciosusuarios.model.Compra;
import com.microserviciosusuarios.model.DetalleCompra;
import com.microserviciosusuarios.repo.ICompraRepo;
import com.microserviciosusuarios.service.ICompraService;


@Service
public class CompraServiceImpl implements ICompraService{

	@Autowired
	private ICompraRepo repo;
	
	
	
	@Override
	public Compra registrarNuevo(Compra compra) {
		// TODO Auto-generated method stub
		
		for(DetalleCompra det : compra.getDetalle()) {
			det.setCompra(compra);
		}
		
		return repo.save(compra);
	}



	@Override
	public List<Compra> FindAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}



	@Override
	public Compra FindById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}



	@Override
	public void Delete(Integer id) {
		// TODO Auto-generated method stub
		
		repo.deleteById(id);
	}

}

package com.microserviciosusuarios.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microserviciosusuarios.model.Reclamo;
import com.microserviciosusuarios.repo.IReclamoRepo;
import com.microserviciosusuarios.service.IReclamoService;

@Service
public class ReclamoServiceImpl implements IReclamoService {

	
	@Autowired
	private IReclamoRepo repo;
	
	@Override
	public Reclamo save(Reclamo reclamo) {
		// TODO Auto-generated method stub
		return repo.save(reclamo);
	}

	@Override
	public Reclamo update(Reclamo reclamo) {
		// TODO Auto-generated method stub
		return repo.save(reclamo);
	}

	@Override
	public List<Reclamo> FindAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Reclamo FindById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public void Delete(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

}

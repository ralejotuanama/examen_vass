package com.microserviciosusuarios.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microserviciosusuarios.model.Cliente;
import com.microserviciosusuarios.repo.IClienteRepo;
import com.microserviciosusuarios.service.IClienteService;


@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteRepo repo;
	
	
	@Override
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return repo.save(cliente);
	}

	@Override
	public Cliente update(Cliente cliente) {
		// TODO Auto-generated method stub
		return repo.save(cliente);
	}

	@Override
	public List<Cliente> FindAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Cliente FindById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public void Delete(Integer id) {
		// TODO Auto-generated method stub
		
		repo.deleteById(id);
	}

}

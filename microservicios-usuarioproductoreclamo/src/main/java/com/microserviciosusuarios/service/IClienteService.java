package com.microserviciosusuarios.service;

import java.util.List;

import com.microserviciosusuarios.model.Cliente;


public interface IClienteService {
	
	
    Cliente save(Cliente cliente) ;
	Cliente update(Cliente cliente);
	List<Cliente> FindAll();
	Cliente FindById(Integer id);
	void Delete(Integer id);
	
	

}

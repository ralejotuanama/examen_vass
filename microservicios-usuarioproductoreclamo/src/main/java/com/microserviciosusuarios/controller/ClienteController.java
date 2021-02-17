package com.microserviciosusuarios.controller;



import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microserviciosusuarios.model.Cliente;
import com.microserviciosusuarios.service.IClienteService;


@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	
	@Autowired
	private IClienteService service;
	
	
	
	@GetMapping
	public ResponseEntity<List<Cliente>> listar() throws Exception{
		List<Cliente> lista = service.FindAll();
		return new ResponseEntity<List<Cliente>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> listarPorId(@PathVariable("id") Integer id) throws Exception{
		Cliente obj = service.FindById(id);
		
		return new ResponseEntity<Cliente>(obj, HttpStatus.OK);
	}

	
		
	@PostMapping
	public ResponseEntity<Cliente> registrar( @RequestBody Cliente cliente) {
		Cliente obj = service.save(cliente);
		return new ResponseEntity<Cliente>(obj, HttpStatus.CREATED);
	}
	
	
	
	@PutMapping
	public ResponseEntity<Cliente> modificar( @RequestBody Cliente cliente) throws Exception{
		Cliente obj = service.update(cliente);
		return new ResponseEntity<Cliente>(obj, HttpStatus.OK);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception{
		service.Delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	

}

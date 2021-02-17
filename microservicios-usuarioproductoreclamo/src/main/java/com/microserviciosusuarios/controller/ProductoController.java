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


import com.microserviciosusuarios.model.Producto;
import com.microserviciosusuarios.service.IProductoService;

@RestController
@RequestMapping("/productos")

public class ProductoController {
	
	
	@Autowired
	private IProductoService service;
	
	

	@GetMapping
	public ResponseEntity<List<Producto>> listar() throws Exception{
		List<Producto> lista = service.FindAll();
		return new ResponseEntity<List<Producto>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Producto> listarPorId(@PathVariable("id") Integer id) throws Exception{
		Producto obj = service.FindById(id);
		
		return new ResponseEntity<Producto>(obj, HttpStatus.OK);
	}

	
		
	@PostMapping
	public ResponseEntity<Producto> registrar( @RequestBody Producto producto) {
		Producto obj = service.save(producto);
		return new ResponseEntity<Producto>(obj, HttpStatus.CREATED);
	}
	
	
	
	@PutMapping
	public ResponseEntity<Producto> modificar( @RequestBody Producto producto) throws Exception{
		Producto obj = service.update(producto);
		return new ResponseEntity<Producto>(obj, HttpStatus.OK);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception{
		service.Delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	
	
	

}

package com.microserviciosusuarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microserviciosusuarios.model.Compra;
import com.microserviciosusuarios.service.ICompraService;


@RestController
@RequestMapping("/compras")
public class CompraController {

	
	@Autowired 
	private ICompraService service;
	
	@GetMapping
	public ResponseEntity<List<Compra>> listar() throws Exception{
		List<Compra> lista = service.FindAll();
		return new ResponseEntity<List<Compra>>(lista, HttpStatus.OK);
	}
	
	
	@PostMapping
	public ResponseEntity<Compra> registrar( @RequestBody Compra compra) {
		Compra obj = service.registrarNuevo(compra);
		return new ResponseEntity<Compra>(obj, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Compra> listarPorId(@PathVariable("id") Integer id) throws Exception{
		
		Compra obj = service.FindById(id);
		
		return new ResponseEntity<Compra>(obj, HttpStatus.OK);
	}
	
}

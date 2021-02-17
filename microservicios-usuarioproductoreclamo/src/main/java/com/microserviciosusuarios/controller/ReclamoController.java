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

import com.microserviciosusuarios.model.Reclamo;
import com.microserviciosusuarios.service.IReclamoService;

@RestController
@RequestMapping("/reclamos")
public class ReclamoController {

	@Autowired
	private IReclamoService service;
	
	
	@GetMapping
	public ResponseEntity<List<Reclamo>> listar() throws Exception{
		List<Reclamo> lista = service.FindAll();
		return new ResponseEntity<List<Reclamo>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Reclamo> listarPorId(@PathVariable("id") Integer id) throws Exception{
		Reclamo obj = service.FindById(id);
		
		return new ResponseEntity<Reclamo>(obj, HttpStatus.OK);
	}

	
		
	@PostMapping
	public ResponseEntity<Reclamo> registrar( @RequestBody Reclamo reclamo) {
		Reclamo obj = service.save(reclamo);
		return new ResponseEntity<Reclamo>(obj, HttpStatus.CREATED);
	}
	
	
	
	
}

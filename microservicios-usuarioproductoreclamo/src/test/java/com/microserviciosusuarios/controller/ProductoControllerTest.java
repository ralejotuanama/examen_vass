package com.microserviciosusuarios.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.microserviciosusuarios.model.Producto;
import com.microserviciosusuarios.repo.IProductoRepo;

@SpringBootTest
class ProductoControllerTest {
	
	@Autowired
	private IProductoRepo repo;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
		
		Producto obj = new Producto();
		obj.setNombre("radio");
		obj.setTecnologia("marca");
		

		
	    
	    Producto pro = repo.save(obj);
	    
	    assertTrue(pro.getNombre().equalsIgnoreCase(obj.getNombre()));
		
	}

}

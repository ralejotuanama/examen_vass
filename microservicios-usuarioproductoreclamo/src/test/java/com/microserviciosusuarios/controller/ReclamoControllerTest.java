package com.microserviciosusuarios.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.microserviciosusuarios.model.Cliente;
import com.microserviciosusuarios.model.Producto;
import com.microserviciosusuarios.model.Reclamo;
import com.microserviciosusuarios.repo.IReclamoRepo;

@SpringBootTest
class ReclamoControllerTest {
	
	@Autowired
	private IReclamoRepo repo;

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
		
		
		Reclamo obj = new Reclamo();
		obj.setMotivo("equivocado");
		obj.setDescripcion("producto estuve equivocado");
		Cliente objcli = new Cliente();
		objcli.setIdCliente(3);
		
		obj.setCliente(objcli);
		
		
		Producto objpro = new Producto();
		objpro.setIdProducto(1);
		
		obj.setProducto(objpro);

		
		
		
	    Reclamo re = repo.save(obj);
	    
	    assertTrue(re.getDescripcion().equalsIgnoreCase(obj.getDescripcion()));
	}

}

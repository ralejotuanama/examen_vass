package com.microserviciosusuarios.controller;



import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.microserviciosusuarios.model.Cliente;
import com.microserviciosusuarios.model.Compra;
import com.microserviciosusuarios.model.Producto;
import com.microserviciosusuarios.model.Reclamo;
import com.microserviciosusuarios.repo.ICompraRepo;

@SpringBootTest
class CompraControllerTest {
	
	@Autowired
	private ICompraRepo repo;
	

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
		
		Compra obj = new Compra();
		String date = "2016-08-16";
	    LocalDate localDate = LocalDate.parse(date);
	    obj.setFechacompra(localDate);
		
		Cliente objcli = new Cliente();
		objcli.setIdCliente(3);
		obj.setCliente(objcli);
		
	    Compra re = repo.save(obj);
	    
	    assertTrue(re.getCliente().getIdCliente().equals(obj.getCliente().getIdCliente()));
		
	}

}

package com.microserviciosusuarios.controller;





import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.microserviciosusuarios.model.Cliente;
import com.microserviciosusuarios.service.IClienteService;

@SpringBootTest
class ClienteControllerTest {

	
	@Autowired
	 private IClienteService repo;
	
	@Autowired
	ClienteController clientecontroller = new ClienteController();

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("antes");
	}

	

	@Test
	void test() {
		
	Cliente obj = new Cliente();
	obj.setTipo("dni");
	obj.setNrodocumento("08849330");
	obj.setNombres("juan");
	obj.setApellidos("huancahuire");

	
	  String date = "2016-08-16";

    
      LocalDate localDate = LocalDate.parse(date);
      
      obj.setFechanacimiento(localDate);
	
	
    Cliente cli = repo.save(obj);
    
    assertTrue(cli.getNrodocumento().equalsIgnoreCase(obj.getNrodocumento()));
	
	
	
	}

}

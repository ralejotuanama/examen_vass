package com.microserviciosusuarios.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microserviciosusuarios.model.Cliente;

public interface IClienteRepo  extends JpaRepository<Cliente, Integer> {

}

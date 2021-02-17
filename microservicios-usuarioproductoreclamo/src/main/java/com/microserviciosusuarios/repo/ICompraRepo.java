package com.microserviciosusuarios.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microserviciosusuarios.model.Compra;

public interface ICompraRepo  extends JpaRepository<Compra, Integer>{

}

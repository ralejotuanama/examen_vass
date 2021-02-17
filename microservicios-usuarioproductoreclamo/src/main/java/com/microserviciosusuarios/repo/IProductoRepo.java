package com.microserviciosusuarios.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microserviciosusuarios.model.Producto;

public interface IProductoRepo  extends JpaRepository<Producto, Integer>{

}

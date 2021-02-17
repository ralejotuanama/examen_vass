package com.microserviciosusuarios.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microserviciosusuarios.model.Reclamo;

public interface IReclamoRepo  extends JpaRepository<Reclamo, Integer>{

}

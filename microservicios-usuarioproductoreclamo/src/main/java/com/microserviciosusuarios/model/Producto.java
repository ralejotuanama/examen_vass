package com.microserviciosusuarios.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer idProducto;
	
	
	public Integer getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTecnologia() {
		return tecnologia;
	}


	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}


	@Column(name = "nombre", nullable = false)
	private String nombre ;
	
	
	@Column(name = "tecnologia", nullable = false)
	private String tecnologia;
	
	
}

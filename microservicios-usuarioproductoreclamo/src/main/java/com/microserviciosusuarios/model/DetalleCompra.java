package com.microserviciosusuarios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "detalle_compra")
public class DetalleCompra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDetalle;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_compra" , nullable = false)
	private Compra compra;
	
	
	@ManyToOne
	@JoinColumn(name = "id_producto" , nullable = false)
	private Producto producto ;
	
	
	public Integer getIdDetalle() {
		return idDetalle;
	}


	public void setIdDetalle(Integer idDetalle) {
		this.idDetalle = idDetalle;
	}


	public Compra getCompra() {
		return compra;
	}


	public void setCompra(Compra compra) {
		this.compra = compra;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	
}

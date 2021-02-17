package com.microserviciosusuarios.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "reclamo")
public class Reclamo {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idReclamo;
	
	@Column(name = "motivo" , nullable = false)
	private String motivo;
	
	@Column(name = "descripcion" , nullable = false)
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente", nullable = false)
	private Cliente cliente;
	
	
	@ManyToOne
	@JoinColumn(name = "id_producto" , nullable = false)
	private Producto producto;


	public Integer getIdReclamo() {
		return idReclamo;
	}


	public void setIdReclamo(Integer idReclamo) {
		this.idReclamo = idReclamo;
	}


	public String getMotivo() {
		return motivo;
	}


	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
}

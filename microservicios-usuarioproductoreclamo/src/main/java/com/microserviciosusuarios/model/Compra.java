package com.microserviciosusuarios.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "compra")
public class Compra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCompra;
	
	
	@ManyToOne
	@JoinColumn(name = "id_cliente" , nullable = false)
	private Cliente cliente;
	
	
	@Column(name = "fechacompra")
	private LocalDate fechacompra;
	
	
	@OneToMany(mappedBy = "compra" , cascade = { CascadeType.ALL } , orphanRemoval = true)
	private List<DetalleCompra> detalle;
	
	
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Integer getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}

	
	public LocalDate getFechacompra() {
		return fechacompra;
	}

	public void setFechacompra(LocalDate fechacompra) {
		this.fechacompra = fechacompra;
	}

	public List<DetalleCompra> getDetalle() {
		return detalle;
	}

	public void setDetalle(List<DetalleCompra> detalle) {
		this.detalle = detalle;
	}

	
	
	
}

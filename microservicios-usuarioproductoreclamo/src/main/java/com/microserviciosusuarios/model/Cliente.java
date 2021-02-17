package com.microserviciosusuarios.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name = "cliente")
public class Cliente {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	
	@Column(name = "tipo", nullable = false)
	private String tipo;
	
	@Column(name = "nrodocumento", nullable = false)
	private String nrodocumento;
	
	@Column(name = "nombres" ,nullable = false)
	private String nombres;
	
	@Column(name = "apellidos" , nullable =  false)
	private String apellidos;
	
	@Column(name = "fechanacimiento" , nullable = false)
	private LocalDate fechanacimiento;
	
	
	
	
	
	public Integer getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getNrodocumento() {
		return nrodocumento;
	}


	public void setNrodocumento(String nrodocumento) {
		this.nrodocumento = nrodocumento;
	}




	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public LocalDate getFechanacimiento() {
		return fechanacimiento;
	}


	public void setFechanacimiento(LocalDate fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}


	

}

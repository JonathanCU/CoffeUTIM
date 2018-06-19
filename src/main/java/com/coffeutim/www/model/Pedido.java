package com.coffeutim.www.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Pedido {
	private @Id @GeneratedValue Long id;
	@OneToOne
	private Estudiante estudiante;
	@OneToMany
	private List<Producto> productos;
	@OneToMany
	private List<Paquete> paquetes;
	private Double totalPagar;
	private Short liquidado;
	private String estatus;
	
	public Pedido(){
		super();
	}
	
	public Pedido(Estudiante estudiante, List<Producto> productos, List<Paquete> paquetes, Double totalPagar,
			Short liquidado, String estatus) {
		super();
		this.estudiante = estudiante;
		this.productos = productos;
		this.paquetes = paquetes;
		this.totalPagar = totalPagar;
		this.liquidado = liquidado;
		this.estatus = estatus;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	public List<Paquete> getPaquetes() {
		return paquetes;
	}
	public void setPaquetes(List<Paquete> paquetes) {
		this.paquetes = paquetes;
	}
	public Double getTotalPagar() {
		return totalPagar;
	}
	public void setTotalPagar(Double totalPagar) {
		this.totalPagar = totalPagar;
	}
	public Short getLiquidado() {
		return liquidado;
	}
	public void setLiquidado(Short liquidado) {
		this.liquidado = liquidado;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
}

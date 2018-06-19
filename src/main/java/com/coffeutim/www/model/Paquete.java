package com.coffeutim.www.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Paquete {
	private @Id @GeneratedValue Long id;
	private String nombre;
	private String descripcion;
	@OneToMany
	private List<Producto> productos;
	private Float costo;
	private String existencia;
	
	public Paquete(){
		super();
	}
	
	public Paquete(String nombre, String descripcion, List<Producto> productos, Float costo, String existencia) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.productos = productos;
		this.costo = costo;
		this.existencia = existencia;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	public Float getCosto() {
		return costo;
	}
	public void setCosto(Float costo) {
		this.costo = costo;
	}
	public String getExistencia() {
		return existencia;
	}
	public void setExistencia(String existencia) {
		this.existencia = existencia;
	}
	
}

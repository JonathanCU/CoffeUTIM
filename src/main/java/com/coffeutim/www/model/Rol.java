package com.coffeutim.www.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Rol {
	
	private @Id @GeneratedValue Long id;
	private String nombreRol;
	private String descricion;
	
	public Rol(){
		super();
	}
	
	public Rol(String nombreRol, String descricion) {
		super();
		this.nombreRol = nombreRol;
		this.descricion = descricion;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreRol() {
		return nombreRol;
	}
	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}
	public String getDescricion() {
		return descricion;
	}
	public void setDescricion(String descricion) {
		this.descricion = descricion;
	}
	
}

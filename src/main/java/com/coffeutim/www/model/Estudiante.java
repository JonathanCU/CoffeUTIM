package com.coffeutim.www.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Estudiante {
	private @Id @GeneratedValue Long id;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Integer numeroControl;
	private Integer grado;
	private String grupo;
	private String telefono;
	private Double saldo;
	
	public Estudiante(){
		super();
	}
	
	public Estudiante(String nombre, String primerApellido, String segundoApellido, Integer numeroControl,
			Integer grado, String grupo, String telefono, Double saldo) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.numeroControl = numeroControl;
		this.grado = grado;
		this.grupo = grupo;
		this.telefono = telefono;
		this.saldo = saldo;
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
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public Integer getNumeroControl() {
		return numeroControl;
	}
	public void setNumeroControl(Integer numeroControl) {
		this.numeroControl = numeroControl;
	}
	public Integer getGrado() {
		return grado;
	}
	public void setGrado(Integer grado) {
		this.grado = grado;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
}

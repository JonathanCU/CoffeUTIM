package com.coffeutim.www.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude = "password")
@Entity
public class User{

	private @Id @GeneratedValue Long id;
	private String username;
	private @JsonIgnore String password;
	@OneToOne
	private Estudiante estudiante;
	@OneToOne
	private Empleado empleado;
	@OneToMany(fetch = FetchType.EAGER)
	private List<Rol> roles;
	
	protected User() {
		
	}

	public User(String username, String password, Estudiante estudiante, Empleado empleado, List<Rol> roles) {
		super();
		this.username = username;
		this.password = password;
		this.estudiante = estudiante;
		this.empleado = empleado;
		this.roles = roles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
	
}

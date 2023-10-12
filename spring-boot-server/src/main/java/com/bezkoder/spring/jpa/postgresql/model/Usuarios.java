package com.bezkoder.spring.jpa.postgresql.model;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuarios {

	

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;
	
	private List<Telefonos> telefonos = null; 
	
	
	public Usuarios() {

	}

	public Usuarios(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmial(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "{ [name=" + name +  ",email=" + email +  ",password=" + password +  ", phones [" + telefonos.toString() + "]" + "]}";
	}
	
	
	
	
}

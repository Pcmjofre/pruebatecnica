package com.bezkoder.spring.jpa.postgresql.model;

import javax.persistence.*;


@Table(name = "telefonos")
public class Telefonos {
	
	@Column(name = "numero")
	private String numero;

	@Column(name = "citycode")
	private String citycode;

	@Column(name = "countrycode")
	private String countrycode;
	
	@Column(name = "correo")
	private String correo;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Telefonos() {
		
	}
	public Telefonos(String numero, String citycode, String countrycode, String correo) {
		this.numero = numero;
		this.citycode = citycode;
		this.countrycode = countrycode;
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Telefonos [numero=" + numero + ", citycode=" + citycode + ", countrycode=" + countrycode + ", correo="
				+ correo + "]";
	}
	
	
	
	
}

package com.holamundo.beans;

import java.io.Serializable;

public class LoginBean implements Serializable{
	
	/**
	 * Autor Stick Cruz 
	 */
	
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String contrasena;
	
	public LoginBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginBean(String nombre, String contrasena) {
		super();
		this.nombre = nombre;
		this.contrasena = contrasena;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public boolean Autenticacion() {
		return contrasena.equals("holi")?true:false;
	}

}

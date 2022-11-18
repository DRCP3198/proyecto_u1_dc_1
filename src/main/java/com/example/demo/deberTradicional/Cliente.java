package com.example.demo.deberTradicional;

public class Cliente {
	

	private String nombre;
	private String cedula;
	private String tipo; 	//Sirve para saber si es niño, adulto o 3ra edad
	
	//SET y GET
	
	protected String getTipo() {
		return tipo;
	}
	protected void setTipo(String tipo) {
		this.tipo = tipo;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getCedula() {
		return cedula;
	}
	protected void setCedula(String cedula) {
		this.cedula = cedula;
	}
	@Override
	public String toString() {
		return "Cliente \nnombre=" + nombre + ", \ncedula=" + cedula + ", \ntipo=" + tipo + "";
	}
	

	
	

}

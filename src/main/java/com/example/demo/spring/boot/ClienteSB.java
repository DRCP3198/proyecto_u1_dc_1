package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class ClienteSB {
	

	private String nombre;
	private String cedula;
	private String tipo; 	//Sirve para saber si es niño, adulto o 3ra edad
	
	//SET y GET
	
	//Metodo calcular descuento
	protected Integer calcularDescuento() {
		
		System.out.println("Sin descuento");
		return 0;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	@Override
	public String toString() {
		return "Cliente \nnombre=" + nombre + ", \ncedula=" + cedula + ", \ntipo=" + tipo + "";
	}
	

	
	

}

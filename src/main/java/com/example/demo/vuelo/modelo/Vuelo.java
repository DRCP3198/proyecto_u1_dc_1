package com.example.demo.vuelo.modelo;

import java.time.LocalDateTime;

public class Vuelo {
	
	private String numero;
	private LocalDateTime fecha;
	private String ciudadSalida;
	private String ciudadDestino;
	

	//Metodos Set y Get
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getCiudadSalida() {
		return ciudadSalida;
	}
	public void setCiudadSalida(String ciudadSalida) {
		this.ciudadSalida = ciudadSalida;
	}
	public String getCiudadDestino() {
		return ciudadDestino;
	}
	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}
	

}

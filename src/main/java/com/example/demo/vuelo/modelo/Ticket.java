package com.example.demo.vuelo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Ticket {
	
	private String numero;
	private String titular;
	private LocalDateTime fechaVuelo;
	private BigDecimal precio;
	
	
	//Metodos setter y getter
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public LocalDateTime getFechaVuelo() {
		return fechaVuelo;
	}
	public void setFechaVuelo(LocalDateTime fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	
	

}

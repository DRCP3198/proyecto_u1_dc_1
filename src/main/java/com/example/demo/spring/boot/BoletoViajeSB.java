package com.example.demo.spring.boot;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service  //Sirve PARA IDENTIFICAR MI LOGICA DE NEGOCIO
public class BoletoViajeSB {

	private String numeroVuelo;
	private LocalDateTime fechaViaje;
	private LocalDateTime fechaCompraBoleto;
	private  int precio;
	private String destino;
	private VendedorViajeSB vendedor;
	private ClienteSB cliente;
	private int edad;
	

	public void agendar(String numeroVuelo, LocalDateTime fechaViaje,int precioV,
			int edad,String destino,VendedorViajeSB vh, ClienteSB ch) {

		this.numeroVuelo=numeroVuelo;
		this.fechaViaje=fechaViaje;
		this.precio = precioV;
		this.destino= destino;
		this.edad=edad;
		this.fechaCompraBoleto = LocalDateTime.now();
		
	    Integer valoDescuento = ch.calcularDescuento();
	    System.out.println("Valor Descuento: " + valoDescuento);
		this.vendedor=vh ;
		this.cliente=ch;
		this.guardarBoletoViaje(this);
		
	}

	private void guardarBoletoViaje(BoletoViajeSB viaje) {
		
		//Insertar en la base de datos, guardar cita
		System.out.println(viaje);
	}
	
	
	
	// SET y GET
	
	@Override
	public String toString() {
		return "BoletoViaje \n[numeroVuelo= " + numeroVuelo + ", \nfechaViaje= " + fechaViaje + ", \nfechaCompraBoleto= "
				+ fechaCompraBoleto + ", \nprecio = " + precio+"$"+ ", \nDestino =" + destino 
				+ ", \n" + cliente + ", \nEdad = " + edad + "]";
	}

	public String getNumero() {
		return numeroVuelo;
	}

	public void setNumero(String numero) {
		this.numeroVuelo = numero;
	}

	public LocalDateTime getFechaViaje() {
		return fechaViaje;
	}

	public void setFechaViaje(LocalDateTime fechaViaje) {
		this.fechaViaje = fechaViaje;
	}

	public LocalDateTime getFechaCompraBoleto() {
		return fechaCompraBoleto;
	}

	public void setFechaCompraBoleto(LocalDateTime fechaCompraBoleto) {
		this.fechaCompraBoleto = fechaCompraBoleto;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public VendedorViajeSB getVendedor() {
		return vendedor;
	}

	public void setVendedor(VendedorViajeSB vendedor) {
		this.vendedor = vendedor;
	}

	public ClienteSB getCliente() {
		return cliente;
	}

	public void setCliente(ClienteSB cliente) {
		this.cliente = cliente;
	}


}

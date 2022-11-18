package com.example.demo.deberTradicional;

import java.time.LocalDateTime;

public class BoletoViaje {

	private String numeroVuelo;
	private LocalDateTime fechaViaje;
	private LocalDateTime fechaCompraBoleto;
	private  int precio;
	private String destino;
	private VendedorViaje v;
	private Cliente cliente;
	private int edad;
	

	public void agendar(String numeroVuelo, LocalDateTime fechaViaje,int precioV, String codigoVendedor,
			String nombreCliente,int edad, String cedulaCliente,String destino, String tipoCliente) {

		this.numeroVuelo=numeroVuelo;
		this.fechaViaje=fechaViaje;
		this.precio = precioV;
		this.destino= destino;
		this.edad=edad;
		this.fechaCompraBoleto = LocalDateTime.now();
		
		VendedorViaje vendeObjeto = new VendedorViaje();
		vendeObjeto.setCod_vendedor(codigoVendedor);
		this.v= vendeObjeto;
		
		
		// tercera edad "TERCERA E", adulto "ADULTO",  y niño "N"
		if(tipoCliente.equals("TE")) {
			ClienteTerceraEdad abuelito= new ClienteTerceraEdad();
			
			abuelito.setCodigoIESS(cedulaCliente);
			abuelito.setTipo("TE");
			this.cliente=abuelito;
			System.out.println("Cliente Tercera Edad: Vuelo con beneficios de tercera edad 63% descuento en su boleto");
			
		} 
		else if(tipoCliente.equals("A")) {
			ClienteAdulto adulto = new ClienteAdulto();
			
			adulto.setCedula(cedulaCliente);
			adulto.setNombre(nombreCliente);
			adulto.setTipo("A");
			
			adulto.setNumCelular("09634713415");
		
			this.cliente=adulto;
			System.out.println("Cliente Adulto: con descuento del 25% en la compra de su boleto ");
		}else {
			
			ClienteNinio ninio= new ClienteNinio();
			ninio.setEdadNinio(9);
			this.cliente= ninio;
			ninio.setTipo("N");
			
			System.out.println("Cliente Niño: Vuelo con descuento de 50%, y participacion por 3 boletos al mundial");
		}
		
		
		this.cliente.setNombre(nombreCliente);
		this.cliente.setCedula(cedulaCliente);
		
		this.guardarBoletoViaje(this);
		
	}

	private void guardarBoletoViaje(BoletoViaje viaje) {
		
		//Insertar en la base de datos, guardar cita
		System.out.println(viaje);
	}
	
	
	
	// SET y GET
	
	@Override
	public String toString() {
		return "BoletoViaje \n[numeroVuelo= " + numeroVuelo + ", \nfechaViaje= " + fechaViaje + ", \nfechaCompraBoleto= "
				+ fechaCompraBoleto + ", \nprecio = " + precio + ", \nDestino =" + destino 
				+ ", \ncliente = " + cliente + ", \nEdad = " + edad + "]";
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

	public VendedorViaje getVendedor() {
		return v;
	}

	public void setVendedor(VendedorViaje vendedor) {
		this.v = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}

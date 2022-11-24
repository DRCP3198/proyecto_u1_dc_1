package com.example.demo.deberHerencia;

public class ClienteTerceraEdadH extends ClienteH {
	
	private String codigoContribuyenteSRI;

	@Override
	 public Integer calcularDescuento() {
	System.out.println("Cliente Tercera Edad: Vuelo con beneficios de tercera edad 75% descuento en su boleto");
	return 75;
	}
	public String getCodigoContribuyente() {
		return codigoContribuyenteSRI;
	}

	public void setCodigoContribuyente(String codigo) {
		this.codigoContribuyenteSRI = codigo;
	}
	

}

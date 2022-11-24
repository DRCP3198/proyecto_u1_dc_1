package com.example.demo.deberHerencia;

public class ClienteAdultoH extends ClienteH {
	

	private String numCelular;
	public String descuento;
	
	@Override
    public Integer calcularDescuento() {
		
		System.out.println("Cliente Adulto: con descuento del 25% en la compra de su boleto ");
		return  25;
	}

	public String getNumCelular() {
		return numCelular;
	}
	public void setNumCelular(String numCelular) {
		this.numCelular = numCelular;
	}
	
	
	

	
	

}

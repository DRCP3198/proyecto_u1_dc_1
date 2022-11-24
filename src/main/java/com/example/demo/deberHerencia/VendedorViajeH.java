package com.example.demo.deberHerencia;


public class VendedorViajeH {

	
	private String cod_vendedor;
	private String nombre;
	
	

	//SET y GET
	public String getCod_vendedor() {
		return cod_vendedor;
	}
	public void setCod_vendedor(String num_vendedor) {
		this.cod_vendedor = num_vendedor;
	}
	
	
	@Override
	public String toString() {
		return  "\ncod_vendedor=" + cod_vendedor +  "";
	}
	

	
	
	
}

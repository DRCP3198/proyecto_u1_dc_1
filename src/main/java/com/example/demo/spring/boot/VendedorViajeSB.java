package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class VendedorViajeSB {

	
	private String cod_vendedor;
	
	
	

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

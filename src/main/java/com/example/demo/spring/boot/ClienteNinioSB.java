package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class ClienteNinioSB extends ClienteSB {
	
	private int edadNinio;
	
	@Override
    public Integer calcularDescuento() {
		
		System.out.println("Cliente Niño: Vuelo con descuento de 65%, y participacion por 3 boletos al mundial");
		return 65;
	}
	
	
	
	public int getEdadNinio() {
		return edadNinio;
	}
	public void setEdadNinio(int edadNinio) {
		this.edadNinio = edadNinio;
	}

	
	

	
	
	
	

}

package com.example.demo.deberHerencia;

public class ClienteNinioH extends ClienteH {
	
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

package com.example.demo.deberHerencia;

import java.time.LocalDateTime;

public class MainFrameworkHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		ClienteAdultoH adulH = new ClienteAdultoH();
		adulH.setCedula("17514571658");
		adulH.setNombre("Dillan Coloma");
		adulH.setNumCelular("0996347134");
		adulH.setTipo("A");
		
	
		
		VendedorViajeH vendH = new VendedorViajeH();
		vendH.setCod_vendedor("152587");
	
		BoletoViajeH boleto = new BoletoViajeH();
		System.out.println("Qatar Airways");
		System.out.println("***********************");
		boleto.agendar("2033", LocalDateTime.of(2023, 8,31,19,30), 2500, 25, " Quito-Ámsterdam", vendH, adulH);
		
	}

}


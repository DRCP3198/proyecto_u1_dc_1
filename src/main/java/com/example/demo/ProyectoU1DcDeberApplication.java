package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.spring.boot.BoletoViajeSB;
import com.example.demo.spring.boot.ClienteAdultoSB;
import com.example.demo.spring.boot.VendedorViajeSB;


@SpringBootApplication
public class ProyectoU1DcDeberApplication implements CommandLineRunner {

	
	@Autowired
	private ClienteAdultoSB adulto;
	
	@Autowired
	private BoletoViajeSB boleto;
	
	@Autowired
	private VendedorViajeSB vendedor;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DcDeberApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Spring Boot");
		System.out.println("Qatar Airways");
		System.out.println("***********************");
		this.adulto.setNombre("Alberto Coloma");
		this.adulto.setNumCelular("0979244176");
		this.adulto.setCedula("175145785");
		this.adulto.setTipo("A");
		this.vendedor.setCod_vendedor("125125");
		//System.out.println(adulto);
		System.out.println(vendedor);
		boleto.agendar("2587",LocalDateTime.of(2023,02 ,2,23,30), 1200, 26, "Quito - Madrid - Suiza", vendedor, adulto);
		
		
	
		
		
		
	}

}

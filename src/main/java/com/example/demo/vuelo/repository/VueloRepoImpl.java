package com.example.demo.vuelo.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.vuelo.modelo.Vuelo;

@Repository
public class VueloRepoImpl implements IVueloRepository{

	public static List <Vuelo> vuelos = new ArrayList<>();
	
	@Override
	public Vuelo buscarPorVuelo(String numero) {
		// TODO Auto-generated method stub
		Vuelo vuelo = new  Vuelo();
		vuelo.setNumero(numero);
		vuelo.setCiudadSalida("Quito");
		vuelo.setCiudadDestino("Tokio");
		vuelo.setFecha(LocalDateTime.of(2022, 12,23,19,30));
		
		return vuelo;
	}

	@Override
	public Vuelo buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		vuelos.add(vuelo);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}

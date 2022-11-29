package com.example.demo.vuelo.repository;

import com.example.demo.vuelo.modelo.Vuelo;

public interface IVueloRepository {
	
	//me busque por numero de vuelo
	public Vuelo buscarPorVuelo(String numero);
	
	//CRUD
	public Vuelo buscar(Integer id);
	
	//
	public void actualizar(Vuelo vuelo);
	public void insertar(Vuelo vuelo);
	public void borrar(Integer id);

}

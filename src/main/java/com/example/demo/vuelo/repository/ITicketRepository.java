package com.example.demo.vuelo.repository;

import com.example.demo.vuelo.modelo.Vuelo;

public interface ITicketRepository {

	//CRUD
	public Vuelo buscar(Integer id); //me busque por numero de ticket
	
	//
	public void actualizar(Vuelo vuelo);
	public void insertar(Vuelo vuelo);
	public void borrar(Integer id);
}

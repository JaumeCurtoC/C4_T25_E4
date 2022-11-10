package com.example.C4_T25.service;

import java.util.List;

import com.example.C4_T25.dto.Sala;

public interface ISalaService {
	
	// CREATE
	public Sala guardarSala(Sala sala);
	
	// READ
	public Sala salaXID(Long id);
	
	// UPDATE 
	public Sala actualizarSala(Sala sala);
	
	// DELETE
	public void eliminarSala(Long id);
	
	// Listar todos las salas
	public List<Sala> listarSalas();

}

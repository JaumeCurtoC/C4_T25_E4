package com.example.C4_T25.service;

import java.util.List;

import com.example.C4_T25.dto.Pelicula;

public interface IPeliculaService {

	// CREATE
	public Pelicula guardarPelicula(Pelicula pelicula);
	
	// READ
	public Pelicula peliculaXID(Long id);
	
	// UPDATE
	public Pelicula actualizarPelicula(Pelicula pelicula);
	
	// DELETE
	public void eliminarPelicula(Long id);
	
	// Listar todos las peliculas
	public List<Pelicula> listarPeliculas();
	
}

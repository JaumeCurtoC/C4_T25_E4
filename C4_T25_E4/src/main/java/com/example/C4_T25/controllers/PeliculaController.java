package com.example.C4_T25.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.C4_T25.dto.Pelicula;
import com.example.C4_T25.service.PeliculaServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculaController {
	
	@Autowired
	PeliculaServiceImpl peliculaServiceImpl;
	
	// Listar Pelicula
	@GetMapping("/peliculas")
	public List<Pelicula> listarPeliculas(){
		return peliculaServiceImpl.listarPeliculas();
	}
	
	// Listar Pelicula por ID
	@GetMapping("/peliculas/id/{id}")
	public Pelicula peliculaXID(@PathVariable(name = "id") Long id) {
		return peliculaServiceImpl.peliculaXID(id);
	}
	
	// Insertar Pelicula
	@PostMapping("/peliculas")
	public Pelicula guardarPelicula(@RequestBody Pelicula pelicula) {
		return peliculaServiceImpl.guardarPelicula(pelicula);
	}
	
	// Actualizar Pelicula
	@GetMapping("/peliculas/{id}")
	public Pelicula actualizarPelicula(@PathVariable(name = "id") Long id, @RequestBody Pelicula pelicula) {
		Pelicula pel_selec = new Pelicula();
		Pelicula pel_actu = new Pelicula();
		
		pel_selec = peliculaServiceImpl.peliculaXID(id);
		
		pel_selec.setNombre(pelicula.getNombre());
		pel_selec.setEdad(pelicula.getEdad());
		
		pel_actu = peliculaServiceImpl.actualizarPelicula(pel_selec);
		
		System.out.println("Pelicula actualizado: " + pel_actu);
		
		return pel_actu;
	}
	
	// Eliminar Pelicula
	@DeleteMapping("/peliculas/{id}")
	public void eliminarPelicula(@PathVariable(name = "id") Long id) {
		peliculaServiceImpl.eliminarPelicula(id);
	}
	
}

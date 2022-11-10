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

import com.example.C4_T25.dto.Sala;
import com.example.C4_T25.service.SalaServiceImpl;

@RestController
@RequestMapping("/api")
public class SalaController {

	@Autowired
	SalaServiceImpl salaServiceImpl;
	
	// Metodo Listar Salas
	@GetMapping("/salas")
	public List<Sala> listarSalas() {
		return salaServiceImpl.listarSalas();
	}
	
	// Metodo listar por id
	@GetMapping("/salas/id/{id}")
	public Sala listarSalaXID(@PathVariable(name = "id") Long id) {
		return salaServiceImpl.salaXID(id);
	}
	
	// Metodo insertar Sala
	@PostMapping("/salas")
	public Sala guardarSala(@RequestBody Sala sala) {
		return salaServiceImpl.guardarSala(sala);
	}
	
	// Metodo actualizar Sala
	@GetMapping("/salas/{id}")
	public Sala actualizarSala(@PathVariable(name = "id") Long id, @RequestBody Sala sala) {
		Sala sala_selec = new Sala();
		Sala sala_actu = new Sala();
		
		sala_selec = salaServiceImpl.salaXID(id);
		
		sala_selec.setNombre(sala.getNombre());
		sala_selec.setPelicula(sala.getPelicula());
		
		sala_actu = salaServiceImpl.actualizarSala(sala_selec);
		
		System.out.println("Sala actualizado: " + sala_actu);
		
		return sala_actu;
	}
	
	// Metodo eliminar Sala
	@DeleteMapping("/salas/{id}")
	public void eliminarSala(@PathVariable(name = "id") Long id) {
		salaServiceImpl.eliminarSala(id);
	}
}

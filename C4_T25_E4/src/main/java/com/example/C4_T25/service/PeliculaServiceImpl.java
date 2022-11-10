package com.example.C4_T25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.C4_T25.dao.IPeliculaDAO;
import com.example.C4_T25.dto.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService {
	
	@Autowired
	IPeliculaDAO peliculaDAO;

	@Override
	public Pelicula guardarPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return peliculaDAO.save(pelicula);
	}

	@Override
	public Pelicula peliculaXID(Long id) {
		// TODO Auto-generated method stub
		return peliculaDAO.findById(id).get();
	}

	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return peliculaDAO.save(pelicula);
	}

	@Override
	public void eliminarPelicula(Long id) {
		// TODO Auto-generated method stub
		peliculaDAO.deleteById(id);
	}

	@Override
	public List<Pelicula> listarPeliculas() {
		// TODO Auto-generated method stub
		return peliculaDAO.findAll();
	}

}

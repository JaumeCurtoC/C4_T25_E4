package com.example.C4_T25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.C4_T25.dao.ISalaDAO;
import com.example.C4_T25.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService{

	@Autowired
	ISalaDAO salaDAO;

	@Override
	public Sala guardarSala(Sala sala) {
		// TODO Auto-generated method stub
		return salaDAO.save(sala);
	}

	@Override
	public Sala salaXID(Long id) {
		// TODO Auto-generated method stub
		return salaDAO.findById(id).get();
	}

	@Override
	public Sala actualizarSala(Sala sala) {
		// TODO Auto-generated method stub
		return salaDAO.save(sala);
	}

	@Override
	public void eliminarSala(Long id) {
		// TODO Auto-generated method stub
		salaDAO.deleteById(id);
	}

	@Override
	public List<Sala> listarSalas() {
		// TODO Auto-generated method stub
		return salaDAO.findAll();
	}
	
	
	
}

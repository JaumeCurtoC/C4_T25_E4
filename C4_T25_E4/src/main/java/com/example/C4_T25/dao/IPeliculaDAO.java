package com.example.C4_T25.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.C4_T25.dto.Pelicula;

public interface IPeliculaDAO extends JpaRepository<Pelicula, Long> {

}

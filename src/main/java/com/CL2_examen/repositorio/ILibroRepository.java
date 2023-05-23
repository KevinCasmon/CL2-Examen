package com.CL2_examen.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CL2_examen.modelo.Libro;

public interface ILibroRepository  extends JpaRepository<Libro, Integer>{

}

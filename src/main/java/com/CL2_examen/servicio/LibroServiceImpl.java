package com.CL2_examen.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CL2_examen.modelo.Libro;
import com.CL2_examen.repositorio.ILibroRepository;

@Service
public class LibroServiceImpl implements ILibroService {

	@Autowired
	ILibroRepository librorepo;
	
	@Override
	public void guardar(Libro libro) {
		librorepo.save(libro);
		
	}

	@Override
	public List<Libro> obtenerLibros() {
		return librorepo.findAll();
	}

}

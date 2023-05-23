package com.CL2_examen.servicio;

import java.util.List;
import com.CL2_examen.modelo.Libro;


public interface ILibroService {
	void guardar(Libro libro);
	List<Libro> obtenerLibros();

}

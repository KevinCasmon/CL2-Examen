package com.CL2_examen.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "libro")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idlibro")
	private int idlibro;

	@NotNull
	@Size(max = 45, message = "Máximo 45 caracteres")
	@Column(name = "titulo")
	private String titulo;

	@Min(value = 1)
	@Column(name = "precio")
	private double precio;

	@Min(value = 1)
	@Column(name = "cantejemplares")
	private int cantejemplares;

	@NotNull
	@Size(max = 45, message = "Máximo 45 caracteres")
	@Column(name = "origen")
	private String origen;

	@Column(name = "idtema")
	private int idtema;

	public int getIdlibro() {
		return idlibro;
	}

	public void setIdlibro(int idlibro) {
		this.idlibro = idlibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantejemplares() {
		return cantejemplares;
	}

	public void setCantejemplares(int cantejemplares) {
		this.cantejemplares = cantejemplares;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public int getIdtema() {
		return idtema;
	}

	public void setIdtema(int idtema) {
		this.idtema = idtema;
	}

}

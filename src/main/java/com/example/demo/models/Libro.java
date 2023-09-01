package com.example.demo.models;

import java.time.Year;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombre;
	private String autor;
	private Year publicacion;
	private int paginas;
	
	public Libro() {
		super();
	}

	public Libro(int id, String nombre, String autor, Year publicacion, int paginas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.autor = autor;
		this.publicacion = publicacion;
		this.paginas = paginas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return autor;
	}

	public void setMarca(String autor) {
		this.autor = autor;
	}

	public Year getModelo() {
		return publicacion;
	}

	public void setModelo(Year publicacion) {
		this.publicacion = publicacion;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setKilometraje(int paginas) {
		this.paginas = paginas;
	}
	
}

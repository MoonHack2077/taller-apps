package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Planeta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombre;
	private String tipo;
	private String galaxia;
	private double tamaño;
	private double añosLuz;
	
	public Planeta() {
		super();
	}

	public Planeta(int id, String nombre, String tipo, String galaxia, double tamaño, double añosLuz) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.galaxia = galaxia;
		this.tamaño = tamaño;
		this.añosLuz = añosLuz;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getGalaxia() {
		return galaxia;
	}

	public void setGalaxia(String galaxia) {
		this.galaxia = galaxia;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public double getAñosLuz() {
		return añosLuz;
	}

	public void setAñosLuz(double añosLuz) {
		this.añosLuz = añosLuz;
	}

	
}

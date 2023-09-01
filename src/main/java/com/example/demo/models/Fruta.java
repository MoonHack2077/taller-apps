package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fruta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombre;
	private String sabor;
	private String color;
	private boolean tieneSemillas;
	
	public Fruta() {
		super();
	}

	public Fruta(int id, String nombre, String sabor, String color, boolean tieneSemillas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.sabor = sabor;
		this.color = color;
		this.tieneSemillas = tieneSemillas;
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

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean getTieneSemillas() {
		return tieneSemillas;
	}

	public void setTieneSemillasa(boolean tieneSemillas) {
		this.tieneSemillas = tieneSemillas;
	}
	
}

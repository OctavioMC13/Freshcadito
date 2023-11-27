package com.example.landsoft.CategoriaBack.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name ="Categoria")
public class Categoria {
	@Id
	private int id;
	@Column(name="nombre_categoria")
	private String nombre;
	
	
	
	public Categoria() {
		super();
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
	
	public Categoria(String nombre) {
		super();
		this.nombre = nombre;
	}

	
}

package com.paraLaTarde.biblioteca;

public class Libro extends Biblioteca{

	private int anioPublicacion;
	
	
	public Libro(String codigo, String titulo) {
		super(codigo, titulo);
		// TODO Auto-generated constructor stub
	}
	
	public Libro(String codigo, String titulo, int anioPublicacion) {
		super(codigo, titulo);
		// TODO Auto-generated constructor stub
		this.anioPublicacion = anioPublicacion;
	}

	
}

package com.pruebas.enum2;

public enum Tutoriales {

	JAVA(40), HTML(30), MYSQL(20);

	int precio;
	
	private Tutoriales(int precio) {
		this.precio = precio;
	}
	
	public int mostrarPrecio() {
		return this.precio;
	}
	
}



































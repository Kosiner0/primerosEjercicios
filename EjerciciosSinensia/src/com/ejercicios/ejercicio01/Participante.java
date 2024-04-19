package com.ejercicios.ejercicio01;

public abstract class Participante {
	
	protected String nombre;
	
	public Participante(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	abstract void mostrarInformacion();
	
}

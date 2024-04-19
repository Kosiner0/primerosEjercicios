package com.ejercicios.ejercicio07;

public class Tambor extends Instrumento{

	private int tamanio;
	
	public Tambor(String nombre, String tipo) {
		super(nombre, tipo);
		// TODO Auto-generated constructor stub
	}

	public Tambor(String nombre, String tipo, int tamanio) {
		super(nombre, tipo);
		this.tamanio = tamanio;
	}

	@Override
	public String toString() {
		return "Tambor [tamanio=" + tamanio + ", nombre=" + nombre + ", tipo=" + tipo + "]";
	}

	public void aporrear() {
		System.out.println("Aporreando tambor " + nombre);
	}
	
}

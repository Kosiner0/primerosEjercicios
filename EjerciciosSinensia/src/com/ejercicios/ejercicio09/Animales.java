package com.ejercicios.ejercicio09;

public class Animales {
	
	protected int numeroPatas;
	
	public Animales(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void andar() {
		System.out.println("Este animal anda sobre " + numeroPatas + " patas.");
	}

	public void comer() {
		
	}

	
}

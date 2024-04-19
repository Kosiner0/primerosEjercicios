package com.ejercicios.ejercicio02;

public class Tocadiscos extends Electrodomestico{

	public Tocadiscos(double precio, int voltaje) {
		super(precio, voltaje);
		// TODO Auto-generated constructor stub
	}

	@Override
	void encender() {
		System.out.println("Encendiendo y reproduciendo vinilo...");
		
	}

	@Override
	void apagar() {
		System.out.println("Deteniendo reproducción...");
		
	}

}

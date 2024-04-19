package com.ejercicios.ejercicio02;

public class CocinaDeGas extends Electrodomestico{
	
	protected int potenciaFuego;
	
	public CocinaDeGas(double precio, int voltaje, int potenciaFuego) {
		super(precio, voltaje);
		this.potenciaFuego = potenciaFuego;
	}

	@Override
	void encender() {
		System.out.println("Encendiendo fuego a " + this.potenciaFuego + "...");
		
	}

	@Override
	void apagar() {
		System.out.println("Apagando fuego...");
		
	}

}

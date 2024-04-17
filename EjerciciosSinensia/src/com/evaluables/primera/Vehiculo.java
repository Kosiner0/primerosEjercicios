package com.evaluables.primera;

import java.util.Random;

public class Vehiculo {

	private final static String COLOR_DEFAULT = "gris";

	private final String matricula;
	private String color;
	protected boolean vehiculoArrancado = false;
	protected double tiempoDeViaje;
	protected double distanciaAvanzada;
	
	Random random = new Random();
	
	public Vehiculo(String matricula) {
		this.color = COLOR_DEFAULT;
		this.matricula = matricula;
	}

	public Vehiculo(String color, String matricula) {
		this.color = color;
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public String getColor() {
		return color;
	}
	
	public void arrancar() {
		if(!vehiculoArrancado) {
			vehiculoArrancado = true;
			tiempoDeViaje = random.nextInt(90) + 55;
		}else {
			System.out.println("Vehículo ya arrancado.");
		}
		
	}
	
	public double calcularVelocidad() {
		return distanciaAvanzada/tiempoDeViaje;
	}

	
	
}

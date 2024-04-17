package com.evaluables.primera;

import java.util.Random;

public class Vehiculo {
	
	/*Superclase Vehículo que abarca variables y métodos generales que se pueden
	 * aplicar a cualquier tipo de vehículo.
	 */
	
	
	//Variable de tipo final static para un color por defecto
	private final static String COLOR_DEFAULT = "gris";

	//Variable de tipo final "matrícula", ya que una vez asignada, no se puede cambiar
	private final String matricula;
	
	//Variables que son generales a cualquier vehículo
	private String color;
	protected boolean vehiculoArrancado = false;
	protected double tiempoDeViaje;
	protected double distanciaAvanzada;
	
	//Instancia de la clase Random para generar números random
	Random random = new Random();
	
	//Constructor de la matricula del vehiculo
	public Vehiculo(String matricula) {
		this.color = COLOR_DEFAULT;
		this.matricula = matricula;
	}

	//Constructor del color y matricula del vehiculo
	public Vehiculo(String color, String matricula) {
		this.color = color;
		this.matricula = matricula;
	}
	
	//Getters de matricula y color del vehiculo
	public String getMatricula() {
		return matricula;
	}

	public String getColor() {
		return color;
	}
	
	
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", color=" + color + ", vehiculoArrancado=" + vehiculoArrancado
				+ ", tiempoDeViaje=" + tiempoDeViaje + ", distanciaAvanzada=" + distanciaAvanzada + "]";
	}

	//Metodo que "arranca" un vehículo y le añade un tiempo de viaje inicial random
	public void arrancar() {
		if(!vehiculoArrancado) {
			vehiculoArrancado = true;
			tiempoDeViaje = random.nextInt(90) + 55;
		}else {
			System.out.println("Vehículo ya arrancado.");
		}
		
	}
	
	//Metodo que calcula la velocidad usando la distancia y el tiempo
	public double calcularVelocidad() {
		return distanciaAvanzada/tiempoDeViaje;
	}
	
}

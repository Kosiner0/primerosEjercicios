package com.evaluables.primera;

import java.util.ArrayList;
import java.util.List;

public class Camion extends Vehiculo implements Conducible{

	/*Clase que implementa la superclase Vehiculo que hereda sus metodos
	 * y que gestiona los vehículos de tipo camión
	 */
	
	//Variables propias de la clase Camión
	private List<String> tacometro;
	private int numeroRuedas;
	
	
	//Constructor implementado de la superclase Vehiculo
	public Camion(String matricula) {
		super(matricula);
		// TODO Auto-generated constructor stub
	}
	
	//Constructor implementado de la superclase Vehiculo
	public Camion(String color, String matricula) {
		super(color, matricula);
		// TODO Auto-generated constructor stub
	}

	//Constructor implementado de la superclase Vehiculo
	public Camion( String color, String matricula, int numeroRuedas) {
		super(color, matricula);
		// TODO Auto-generated constructor stub
		tacometro = new ArrayList<>();
		this.numeroRuedas= numeroRuedas;
	}

	
	//Método para sacar por pantalla el tacógrafo
	public List<String> getTacometro() {
		return tacometro;
	}
	
	@Override
	public String toString() {
		return "Camion [tacometro=" + tacometro + ", numeroRuedas=" + numeroRuedas + ", vehiculoArrancado="
				+ vehiculoArrancado + ", tiempoDeViaje=" + tiempoDeViaje + ", distanciaAvanzada=" + distanciaAvanzada
				+ ", matricula=" + getMatricula() + ", color=" + getColor() + "]";
	}

	//Método parar implementado de la interfaz Conducible, el cual
	//arranca el vehículo.
	@Override
	public void conducir() {
		// TODO Auto-generated method stub
		System.out.println("El camión de matrícula " + getMatricula() + " y color " + getColor() + " conduce sobre " + numeroRuedas + " ruedas.");
		arrancar();
	}

	//Método parar implementado de la interfaz Conducible, que saca por pantalla
	//los km a recorrer, los añade al contador e introduce la velocidad al tacógrafo
	@Override
	public void avanzar(int distanciaKm) {
		// TODO Auto-generated method stub
		System.out.println("El camión avanza " + distanciaKm + " km.");
		distanciaAvanzada += distanciaKm;
		insertarVelocidad();
	}

	//Método parar implementado de la interfaz Conducible, 
	//que añade distancia al contador y mete la velocidad al tacógrafo
	@Override
	public void retroceder(int distanciaKm) {
		// TODO Auto-generated method stub
		System.out.println("El camión retrocede " + distanciaKm + " km.");
		distanciaAvanzada += distanciaKm;
		insertarVelocidad();
	}

	//Método parar implementado de la interfaz Conducible, que saca por pantalla
	//los km recorridos, el tiempo tardado y la velocidad
	@Override
	public void parar() {
		// TODO Auto-generated method stub
		System.out.println("El camión ha parado.");
		vehiculoArrancado = false;
	
		double velocidad = calcularVelocidad();
		System.out.println("El camión ha recorrido " + String.format("%.0f", distanciaAvanzada) + " KM en " + String.format("%.0f", tiempoDeViaje) + " horas, a una velocidad de " + String.format("%.0f", velocidad) + " Km/h.");
	
	}
	
	//Método que no devuelve nada y que inserta la velocidad en el tacómetro
	//usando el metodo para calcular la velocidad de la superclase Vehiculo
	public void insertarVelocidad() {
		tacometro.add("" + String.format("%.0f", calcularVelocidad())); 
	}

}

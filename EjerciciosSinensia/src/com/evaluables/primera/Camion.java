package com.evaluables.primera;

import java.util.ArrayList;
import java.util.List;

public class Camion extends Vehiculo implements Conducible{

	private List<String> tacometro;
	private int numeroRuedas;
	
	
	public Camion(String matricula) {
		super(matricula);
		// TODO Auto-generated constructor stub
	}
	
	public Camion(String color, String matricula) {
		super(color, matricula);
		// TODO Auto-generated constructor stub
	}

	public Camion(String matricula, int numeroRuedas) {
		super(matricula);
		// TODO Auto-generated constructor stub
		tacometro = new ArrayList<>();
		this.numeroRuedas= numeroRuedas;
	}

	public List<String> getTacometro() {
		return tacometro;
	}

	@Override
	public void conducir() {
		// TODO Auto-generated method stub
		System.out.println("El camión conduce sobre " + numeroRuedas + " ruedas.");
		arrancar();
	}

	@Override
	public void avanzar(int distanciaKm) {
		// TODO Auto-generated method stub
		System.out.println("El camión avanza " + distanciaKm + " km.");
		distanciaAvanzada += distanciaKm;
		insertarVelocidad(distanciaAvanzada/tiempoDeViaje);
	}

	@Override
	public void retroceder(int distanciaKm) {
		// TODO Auto-generated method stub
		System.out.println("El camión retrocede " + distanciaKm + " km.");
		distanciaAvanzada += distanciaKm;
		insertarVelocidad(distanciaAvanzada/tiempoDeViaje);
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		System.out.println("El camión ha parado.");
		vehiculoArrancado = false;
	
		double velocidad = calcularVelocidad();
		System.out.println("El camión ha recorrido " + String.format("%.0f", distanciaAvanzada) + " KM en " + String.format("%.0f", tiempoDeViaje) + " horas, a una velocidad de " + String.format("%.0f", velocidad) + " Km/h.");
	
	}
	
	public void insertarVelocidad(double sentencia) {
		tacometro.add("" + String.format("%.0f", sentencia)); 
	}

}

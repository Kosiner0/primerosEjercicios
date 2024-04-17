package com.evaluables.primera;

public class Coche extends Vehiculo implements Conducible{

	private final static String MARCA_DEFAULT = "BMW";
	private final static String MODELO_DEFAULT = "m4";
	private final static int POTENCIA_DEFAULT = 510;	
	private final static int NUMERO_RUEDAS = 4;
	
	protected String marca;
	protected String modelo;
	protected int potencia;
	

	public Coche(String matricula) {
		super(matricula);
		// TODO Auto-generated constructor stub
		this.marca = MARCA_DEFAULT;
		this.modelo = MODELO_DEFAULT;
		this.potencia = POTENCIA_DEFAULT;
	}

	public Coche(String color, String matricula, String marca, String modelo, int potencia) {
		super(color, matricula);
		// TODO Auto-generated constructor stub
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getPotencia() {
		return potencia;
	}
	
	@Override
	public void conducir() {
		// TODO Auto-generated method stub
		System.out.println("El coche conduce sobre " + NUMERO_RUEDAS + " ruedas.");
		arrancar();
	}

	@Override
	public void avanzar(int distanciaKm) {
		// TODO Auto-generated method stub
		System.out.println("El coche avanza " + distanciaKm + " km.");
		distanciaAvanzada += distanciaKm;
		tiempoDeViaje += random.nextInt(10);
	}

	@Override
	public void retroceder(int distanciaKm) {
		// TODO Auto-generated method stub
		System.out.println("El coche retrocede " + distanciaKm + " km.");
		distanciaAvanzada += distanciaKm;
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		System.out.println("El coche ha parado.");
		vehiculoArrancado = false;
	
		double velocidad = calcularVelocidad();
		System.out.println("El coche ha recorrido " + String.format("%.0f", distanciaAvanzada) + " KM en " + String.format("%.0f", tiempoDeViaje) + " horas, a una velocidad de " + String.format("%.0f", velocidad) + " Km/h.");
	}
	
	
	
	
}

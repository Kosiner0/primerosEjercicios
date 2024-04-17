package com.evaluables.primera;

public class Coche extends Vehiculo implements Conducible{

	/*Clase que implementa la superclase Vehiculo que hereda sus metodos
	 * y que gestiona los vehículos de tipo coche
	 */
	
	//Variables por defecto que no cambian
	private final static String MARCA_DEFAULT = "BMW";
	private final static String MODELO_DEFAULT = "m4";
	private final static int POTENCIA_DEFAULT = 510;	
	private final static int NUMERO_RUEDAS = 4;
	
	//Variables propias de un coche
	protected String marca;
	protected String modelo;
	protected int potencia;
	
	
	//Constructor implementado de la superclase Vehiculo
	public Coche(String matricula) {
		super(matricula);
		// TODO Auto-generated constructor stub
		this.marca = MARCA_DEFAULT;
		this.modelo = MODELO_DEFAULT;
		this.potencia = POTENCIA_DEFAULT;
	}

	//Constructor implementado de la superclase Vehiculo
	public Coche(String color, String matricula, String marca, String modelo, int potencia) {
		super(color, matricula);
		// TODO Auto-generated constructor stub
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
	}

	//Getters de las variables de coche
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
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", vehiculoArrancado="
				+ vehiculoArrancado + ", tiempoDeViaje=" + tiempoDeViaje + ", distanciaAvanzada=" + distanciaAvanzada
				+ ", matricula=" + getMatricula() + ", color=" + getColor() + "]";
	}
	
	//Método parar implementado de la interfaz Conducible, el cual
	//arranca el vehículo.
	@Override
	public void conducir() {
		// TODO Auto-generated method stub
		System.out.println("El coche de matrícula " + getMatricula() + " y color " + getColor() + " conduce sobre " + NUMERO_RUEDAS + " ruedas.");
		arrancar();
	}

	//Método parar implementado de la interfaz Conducible, que saca por pantalla
	//los km a recorrer, los añade al contador e introduce la velocidad al tacógrafo
	@Override
	public void avanzar(int distanciaKm) {
		// TODO Auto-generated method stub
		System.out.println("El coche avanza " + distanciaKm + " km.");
		distanciaAvanzada += distanciaKm;
		tiempoDeViaje += random.nextInt(10);
	}
	
	//Método parar implementado de la interfaz Conducible, 
	//que añade distancia al contador y mete la velocidad al tacógrafo
	@Override
	public void retroceder(int distanciaKm) {
		// TODO Auto-generated method stub
		System.out.println("El coche retrocede " + distanciaKm + " km.");
		distanciaAvanzada += distanciaKm;
	}

	//Método parar implementado de la interfaz Conducible, que saca por pantalla
	//los km recorridos, el tiempo tardado y la velocidad
	@Override
	public void parar() {
		// TODO Auto-generated method stub
		System.out.println("El coche ha parado.");
		vehiculoArrancado = false;
	
		double velocidad = calcularVelocidad();
		System.out.println("El coche ha recorrido " + String.format("%.0f", distanciaAvanzada) + " KM en " + String.format("%.0f", tiempoDeViaje) + " horas, a una velocidad de " + String.format("%.0f", velocidad) + " Km/h.");
	}
	
	
	
	
}

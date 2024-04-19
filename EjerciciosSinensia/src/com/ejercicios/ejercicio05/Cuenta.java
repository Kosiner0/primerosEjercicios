package com.ejercicios.ejercicio05;

public class Cuenta {

	protected String titular;
	protected double cantidad;
	
	
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	public Cuenta(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	//Funcion para ingresar cierta cantidad de la cuenta
	public void ingresar(double cantidadParaIngresar) {
		this.cantidad = (cantidadParaIngresar < 0) ? cantidad : cantidad+cantidadParaIngresar ;
	}
	
	//Funcion para retirar cierta cantidad de la cuenta
	public void retirar(double cantidadParaRetirar) {
		this.cantidad -= cantidadParaRetirar;
		this.cantidad = (this.cantidad < 0) ? 0 : cantidad ;
	}
	
	//Funcion principal para probar la clase Cuenta
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta("Cuenta de Prueba");
		
		cuenta.setCantidad(100.50);
		System.out.println(cuenta.toString()); 
		
		cuenta.ingresar(-100.50);
		System.out.println(cuenta.toString());
		
		
		
	}
	
}


















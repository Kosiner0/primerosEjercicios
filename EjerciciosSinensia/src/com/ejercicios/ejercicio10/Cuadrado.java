package com.ejercicios.ejercicio10;

public class Cuadrado extends FiguraGeometrica{

	private double lado;
	
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}

	@Override
	double calcularArea() {
		// TODO Auto-generated method stub
		return lado * lado;
	}

	@Override
	double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 4 * lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", área=" + calcularArea() + ", perímetro="
				+ calcularPerimetro() + "]";
	}
	
}

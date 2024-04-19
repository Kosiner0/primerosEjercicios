package com.ejercicios.ejercicio10;

public class Circulo extends FiguraGeometrica implements FiguraGeometricaInterfaz{
	
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public
	double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * radio * radio;
	}

	@Override
	public
	double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", área=" + calcularArea() + ", perímetro="
				+ calcularPerimetro() + "]";
	}
	
}

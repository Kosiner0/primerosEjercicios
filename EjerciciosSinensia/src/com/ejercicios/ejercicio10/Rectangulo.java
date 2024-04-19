package com.ejercicios.ejercicio10;

public class Rectangulo extends FiguraGeometrica {

	private double base;
	private double altura;
	
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	
	@Override
	double calcularArea() {
		// TODO Auto-generated method stub
		return base * altura;
	}

	@Override
	double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * (base + altura);
	}


	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + ", área=" + calcularArea()
				+ ", perímetro=" + calcularPerimetro() + "]";
	}

}

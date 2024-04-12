package ejercicio10;

abstract class FiguraGeometrica {
	
	/*
	 * Área del cuadrado = lado × lado
	 * Perímetro del cuadrado = lado x 4
	 * 
	 * Área del rectángulo = base x altura
	 * Perímetro del rectángulo = 2base + 2altura
	 * 
	 * Área del círculo = π x radio²
	 * Perímetro del círculo = π x diámetro
	 * 
	 */
	
	abstract double calcularArea();
	
	abstract double calcularPerimetro();

}

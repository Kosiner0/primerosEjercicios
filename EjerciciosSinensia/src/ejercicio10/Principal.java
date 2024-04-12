package ejercicio10;

public class Principal {
	
	public static void main(String[] args) {
		
		//Usando la clase abstracta
		FiguraGeometrica cuadrado1 = new Cuadrado(2);
		FiguraGeometrica rectangulo1 = new Rectangulo(4, 2);
		FiguraGeometrica circulo1 = new Circulo(3);
		
		//Usando la interfaz
		Cuadrado cuadrado2 = new Cuadrado(2);
		Rectangulo rectangulo2 = new Rectangulo(4, 2);
		Circulo circulo2 = new Circulo(3);
		
		System.out.println("USANDO CLASE ABSTRACTA: ");
		System.out.println(cuadrado1);
		System.out.println(rectangulo1);
		System.out.println(circulo1);
		
		System.out.println("\nUSANDO INTERFAZ: ");
		System.out.println(cuadrado2);
		System.out.println(rectangulo2);
		System.out.println(circulo2);
	}
}

package ejercicio11;

public class Electrodomestico {

	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	//Atributos por defecto
	private static final String[] COLORES_VALIDOS = {"blanco", "rojo", "negro", "gris", "azul"};
	private static final String COLOR_BASE = "blanco";
	private static final double PRECIO_BASE = 100;
	private static final double PESO_BASE = 5;
	private static final char CONSUMO_ENERGETICO_BASE = 'F';
	
	
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE;
		this.color = COLOR_BASE;
		this.consumoEnergetico = CONSUMO_ENERGETICO_BASE;
		this.peso = PESO_BASE;
	}
	
	public Electrodomestico(double precio, double peso) {
		this.precioBase = precio;
		this.color = COLOR_BASE;
		this.consumoEnergetico = CONSUMO_ENERGETICO_BASE;
		this.peso = peso;
	}
	
	
}

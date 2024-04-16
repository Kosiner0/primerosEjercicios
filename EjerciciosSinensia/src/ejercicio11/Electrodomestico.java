package ejercicio11;

public class Electrodomestico {

	//Atributos por defecto
	private static final String[] COLORES_VALIDOS = {"blanco", "rojo", "negro", "gris", "azul"};
	private static final char[] LETRAS_VALIDAS = {'A', 'B', 'C', 'D', 'E', 'F'};
	private static final String COLOR_BASE = "blanco";
	private static final double PRECIO_POR_DEFECTO = 100;
	private static final double PESO_BASE = 5;
	private static final char CONSUMO_ENERGETICO_BASE = 'F';
	
	//Variables de instancia
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	
	public Electrodomestico() {
		this.precioBase = PRECIO_POR_DEFECTO;
		this.color = COLOR_BASE;
		this.consumoEnergetico = CONSUMO_ENERGETICO_BASE;
		this.peso = PESO_BASE;
	}
	
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR_BASE;
		this.consumoEnergetico = CONSUMO_ENERGETICO_BASE;
		this.peso = peso;
	}
	
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	
	public char comprobarConsumoEnergetico(char letra) {
		letra = Character.toUpperCase(letra);
		
		for(char c : LETRAS_VALIDAS) {
			if(c == letra) {
				return letra;
			}
		}
		return CONSUMO_ENERGETICO_BASE;
	}
	
	public String comprobarColor(String color) {
		
		for(String c : COLORES_VALIDOS) {
			if(c.equalsIgnoreCase(color)) {
				return color;
			}
		}
		return COLOR_BASE;
	}
	
	public double precioFinal() {
		
		switch(this.consumoEnergetico) {
			case 'A':
				this.precioBase += 100 + precioPorTamanio();
				break;
				
			case 'B':
				this.precioBase += 80 + precioPorTamanio();
				break;
				
			case 'C':
				this.precioBase += 60 + precioPorTamanio();
				break;
				
			case 'D':
				this.precioBase += 50 + precioPorTamanio();
				break;
				
			case 'E':
				this.precioBase += 30 + precioPorTamanio();
				break;
				
			case 'F':
				this.precioBase += 10 + precioPorTamanio();
				break;
				
			default:
				break;
			
		}
		return this.precioBase;
	}
	
	public double precioPorTamanio() {
		if(this.peso >= 0 && this.peso <= 19) {
			return (this.precioBase += 10);
			
		}else if(this.peso >= 20 && this.peso <= 49) {
			return (this.precioBase += 50);
			
		}else if(this.peso >= 50 && this.peso <= 79) {
			return (this.precioBase += 80);
			
		}else {
			return (this.precioBase += 100);
		}
		
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
	
}


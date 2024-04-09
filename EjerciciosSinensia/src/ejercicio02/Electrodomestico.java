package ejercicio02;

public abstract class Electrodomestico {
	
	protected double precio;
	protected int voltaje;
	
	public Electrodomestico(double precio, int voltaje) {
		super();
		this.precio = precio;
		this.voltaje = voltaje;
	}

	public double getPrecio() {
		return precio;
	}

	public int getVoltaje() {
		return voltaje;
	}
	
	abstract void encender();
	
	abstract void apagar();
	
}

package ejercicio11;

public class Lavadora extends Electrodomestico{

	private static final double CARGA_BASE = 5;
	
	private double carga;
	

	public Lavadora() {
		super();
		// TODO Auto-generated constructor stub
		this.carga = CARGA_BASE;
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
		this.carga = CARGA_BASE;
	}

	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		// TODO Auto-generated constructor stub
		this.carga = carga;
	}

	public double getCarga() {
		return carga;
	}

	@Override
	public double precioFinal() {
		// TODO Auto-generated method stub
		super.precioFinal();
		if(this.carga > 30) {
			precioBase += 50;
		}
		return precioBase;
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
}

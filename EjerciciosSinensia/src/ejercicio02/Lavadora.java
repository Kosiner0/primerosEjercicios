package ejercicio02;

public class Lavadora extends Electrodomestico{
	
	public Lavadora(double precio, int voltaje) {
		super(precio, voltaje);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void encender() {
		System.out.println("Encendiendo lavadora...");
		
	}

	@Override
	void apagar() {
		System.out.println("Deteniendo lavadora...");
		
	}
	
	

}

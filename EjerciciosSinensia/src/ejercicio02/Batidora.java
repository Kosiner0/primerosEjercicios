package ejercicio02;

public class Batidora extends Electrodomestico{

	public Batidora(double precio, int voltaje) {
		super(precio, voltaje);
		// TODO Auto-generated constructor stub
	}

	@Override
	void encender() {
		System.out.println("Encendiendo batidora...");
		
	}

	@Override
	void apagar() {
		System.out.println("Parando batidora...");
		
	}

}

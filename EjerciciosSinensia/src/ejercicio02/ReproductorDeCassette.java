package ejercicio02;

public class ReproductorDeCassette extends Tocadiscos{

	public ReproductorDeCassette(double precio, int voltaje) {
		super(precio, voltaje);
		// TODO Auto-generated constructor stub
	}

	public static void reproducirCassette() {
		System.out.println("Reproduciendo cassette...");
		
	}
	
	@Override
	void apagar() {
		System.out.println("Deteniendo reproducción...");
		
	}

}

package ejercicio02;

public class ReproductorDeCD extends Tocadiscos{

	public ReproductorDeCD(double precio, int voltaje) {
		super(precio, voltaje);
		// TODO Auto-generated constructor stub
	}
	
	public static void reproducirCD() {
		System.out.println("Reproduciendo CD...");
		
	}
	
	@Override
	void apagar() {
		System.out.println("Deteniendo reproducción...");
		
	}

}

package ejercicio07;

public class Flauta extends Instrumento{

	private String modelo;
	
	
	public Flauta(String nombre, String tipo) {
		super(nombre, tipo);
		// TODO Auto-generated constructor stub
	}

	public Flauta(String nombre, String tipo, String modelo) {
		super(nombre, tipo);
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Flauta [modelo=" + modelo + ", nombre=" + nombre + ", tipo=" + tipo + "]";
	}

	@Override
	public void tocar() {
		super.tocar();
		System.out.println("Soplando.");
	}
	
}

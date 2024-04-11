package ejercicio07;

public class Guitarra extends Instrumento{

	protected int numeroCuerdas;
	
	public Guitarra(String nombre, String tipo) {
		super(nombre, tipo);
		// TODO Auto-generated constructor stub
	}

	public Guitarra(String nombre, String tipo, int numeroCuerdas) {
		super(nombre, tipo);
		this.numeroCuerdas = numeroCuerdas;
	}

	@Override
	public String toString() {
		return "Guitarra [numeroCuerdas=" + numeroCuerdas + ", nombre=" + nombre + ", tipo=" + tipo + "]";
	}
	
}

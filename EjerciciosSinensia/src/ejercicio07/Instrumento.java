package ejercicio07;

public class Instrumento {

	protected String nombre;
	protected String tipo;
	
	public Instrumento(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void tocar() {
		System.out.println("Tocando el instrumento " + nombre);
	}
	
	public void afinar() {
		System.out.println("Afinando el instrumento " + nombre);
	}
}

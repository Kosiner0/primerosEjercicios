package ejercicio.biblioteca;

public class Usuarios {

	private final static int NUMERO_PRESTAMOS_SOCIOS = 20;
	private final static int NUMERO_PRESTAMOS_USUARIOS = 2;
	
	private final String dni;
	private String nombre;
	private boolean socio;
	
	
	public Usuarios(String dni, String nombre, boolean socio) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.socio = socio;
	}


	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean isSocio() {
		return socio;
	}

	@Override
	public String toString() {
		return "Usuarios [dni=" + dni + ", nombre=" + nombre + ", es socio=" + socio + "]";
	}

}

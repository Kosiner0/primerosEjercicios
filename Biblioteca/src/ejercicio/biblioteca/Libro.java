package ejercicio.biblioteca;

public class Libro extends Biblioteca{

	private final static int DURACION_PRESTAMO_SOCIOS = 30;
	private final static int DURACION_PRESTAMO_USUARIOS = 15;
	
	private int anioPublicacion;
	
	
	public Libro(int codigo, String titulo) {
		super(codigo, titulo);
		// TODO Auto-generated constructor stub
	}
	
	public Libro(int codigo, String titulo, int anioPublicacion) {
		super(codigo, titulo);
		// TODO Auto-generated constructor stub
		this.anioPublicacion = anioPublicacion;
	}

	@Override
	public int getCodigo() {
		// TODO Auto-generated method stub
		return super.getCodigo();
	}

	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return super.getTitulo();
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	@Override
	public String toString() {
		return "Libro [código=" + getCodigo() + ", anioPublicacion=" + anioPublicacion + "]";
	}

	
}

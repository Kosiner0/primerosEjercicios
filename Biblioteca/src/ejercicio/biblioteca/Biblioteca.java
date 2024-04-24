package ejercicio.biblioteca;

public class Biblioteca {

	private final int codigo;
	private String titulo;
	
	
	public Biblioteca(int codigo, String titulo) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
	}

	
	public int getCodigo() {
		return codigo;
	}


	public String getTitulo() {
		return titulo;
	}

	@Override
	public String toString() {
		return "Biblioteca [codigo=" + codigo + ", titulo=" + titulo + "]";
	}
	
}

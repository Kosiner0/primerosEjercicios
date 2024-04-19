package com.ejercicios.ejercicio04;

public class Libro {
	
	
	private String titulo;
	private String ISBN;
	private String autor;
	private int numeroPaginas;
	
	public Libro(String titulo, String ISBN, String autor, int numeroPaginas) {
		super();
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	public String compararPaginas(Libro libro) {
		String libroConMasPaginas = "";
		if(this.numeroPaginas > libro.getNumeroPaginas()) {
			libroConMasPaginas += this.titulo;
		}else if(this.numeroPaginas < libro.getNumeroPaginas()) {
			libroConMasPaginas += libro.titulo;
		}else {
			libroConMasPaginas += "Tienen el mismo numero de páginas.";
		}
		return libroConMasPaginas;
	}

	@Override
	public String toString() {
		return "El libro '" + this.titulo + "' con ISBN '" + this.ISBN + "' creado por el autor '" + this.autor + "' tiene " + this.numeroPaginas + " páginas.";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

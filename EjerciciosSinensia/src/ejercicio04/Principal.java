package ejercicio04;

public class Principal {

	public static void main(String[] args) {
		Libro libro1 = new Libro("El Principito", "29749278NA", "Cesar Augusto", 138);
		Libro libro2 = new Libro("La Olvidona", "035193725LX", "Primo Rivera", 102);
		
		System.out.println("" + libro1.toString() + "\n" + libro2.toString());
		System.out.println("Libro con más páginas: " + libro1.compararPaginas(libro2));
	}

}

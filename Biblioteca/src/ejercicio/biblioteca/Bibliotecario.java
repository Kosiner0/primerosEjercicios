package ejercicio.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Bibliotecario {
	static List<Biblioteca> lista = new ArrayList<>();
	static List<Usuarios> usuarios = new ArrayList<>();
	
	static Biblioteca documentoActual;
	
	public static void generarBiblioteca() {
		
		Libro libro1 = new Libro(1, "Primer Libro", 2024);
		Libro libro2 = new Libro(2, "Segundo Libro", 2023);
		Revista revista1 = new Revista(3, "Primera Revista");
		Revista revista2 = new Revista(4, "Segunda Revista");
		
		lista.add(libro1);
		lista.add(libro2);
		lista.add(revista1);
		lista.add(revista2);
	}
	
	public static void generarUsuarios() {
		
		Usuarios usuario1 = new Usuarios("12345678L", "Paco Pérez", true);
		Usuarios usuario2 = new Usuarios("98765432M", "Checo Pérez", false);
		Usuarios usuario3 = new Usuarios("13579246D", "Fermin Palomo", false);
		Usuarios usuario4 = new Usuarios("24681357S", "María Alcaide", true);
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		usuarios.add(usuario4);
	}
	
	public static boolean seleccionarDocumento(int codigo) {
		
		for(Biblioteca biblioteca : lista) {
			if(biblioteca.getCodigo() == codigo) {
				documentoActual = biblioteca;
				System.out.println(biblioteca.toString());
				return true;
			}
		}
		return false;
	}
	
	public static void prestarDocumentoActual(String dni) {
		
		
	}
	
	public static void devolverDocumentoActual() {
		
		
	}
	
	public static void buscarDocumentos(String textoBuscar) {
		
		
	}
	
	public static void generarInformePrestamos() {
		
		
	}
	
	
}

package ejercicio.biblioteca;

import entrada.Teclado;

public class Principal {

	public static void menu() {
		System.out.println("\n0-Salir del programa.");
		System.out.println("1-Selecciona documento.");
		System.out.println("2-Presta documento actual.");
		System.out.println("3-Devuelve documento actual.");
		System.out.println("4-Busca documentos.");
		System.out.println("5-Informe de préstamos.");
	}
	
	public static void main(String[] args) {
		int opcion;
		boolean encontrado = false;
		
		Bibliotecario.generarBiblioteca();
		Bibliotecario.generarUsuarios();
		
		do {
			
			menu();
			opcion = Teclado.leerEntero("\n--Introduce la opcion: ");
			
			switch(opcion) {
					
				case 0:
					break;
				
				case 1:
					int codigo = Teclado.leerEntero("Introduce el codigo del documento: ");
					encontrado = Bibliotecario.seleccionarDocumento(codigo);
					if(encontrado) {
						System.out.println("Documento encontrado y seleccionado.");
						
					}else {
						System.out.println("No existe ningún documento con ese código.");
						
					}
					break;
					
				case 2:
					String dni = Teclado.leerCadena("Introduce el DNI del usuario: ");
					
					break;
					
				case 3:
					break;
					
				case 4:
					break;
					
				case 5:
					break;
					
				default:
					System.out.println("La pción debe estar comprendida entre 0 y 5.");
					break;
			}
			
		}while(opcion != 0);
		System.out.println("Fin de programa.");

	}

}

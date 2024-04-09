package ejercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Productos> productos = new ArrayList<>();
		
		int opcion;
		do {
			System.out.println("\n1-Introducir nuevo ordenador.");
			System.out.println("2-Lista de ordenadores.");
			System.out.println("3-Eliminar ordenador.");
			System.out.println("0-SALIR.");
			
			System.out.print("Ingrese su opcion: ");
            opcion = scanner.nextInt();
            
            switch(opcion) {
	            case 1:
	            	System.out.print("\nIngrese el codigo del ordenador: ");
	            	int codigo = scanner.nextInt();
	            	scanner.nextLine();
	            	
	            	System.out.print("Ingrese el modelo del ordenador: ");
	            	String modelo = scanner.next();
	            	scanner.nextLine();
	            	
	            	System.out.print("Ingrese el precio del ordenador: ");
	            	double precio = scanner.nextDouble();
	            	scanner.nextLine();
	            	
	            	System.out.print("Ingrese la cantidad de ordenadores: ");
	            	int cantidad = scanner.nextInt();
	            	scanner.nextLine();
	            	
	            	Ordenadores ordenador = new Ordenadores(codigo, modelo, precio, cantidad);
	            	productos.add(ordenador);
	            	System.out.println("Se ha introducido un ordenador en la base de datos.");
	            	
	            	/* for(int i = 0; i < productos.size(); i++) {
	            		if(((Ordenadores) productos).getCodigo() == codigo) {
	            			System.out.println("Este codigo ya existe.");
	            		}else {
	            			
	    	            	System.out.print("Ingrese el modelo del ordenador: ");
	    	            	String modelo = scanner.next();
	    	            	scanner.nextLine();
	    	            	
	    	            	System.out.print("Ingrese el precio del ordenador: ");
	    	            	double precio = scanner.nextDouble();
	    	            	scanner.nextLine();
	    	            	
	    	            	System.out.print("Ingrese la cantidad de ordenadores: ");
	    	            	int cantidad = scanner.nextInt();
	    	            	scanner.nextLine();
	    	            	
	    	            	Ordenadores ordenador = new Ordenadores(codigo, modelo, precio, cantidad);
	    	            	productos.add(ordenador);
	    	            	
	    	            	System.out.println("Se ha introducido un ordenador en la base de datos.");
	            		}
	            	}*/
	            	break;
	            
	            case 2:
	            	for(Productos producto : productos) {
	            		if(producto instanceof Ordenadores) {
	            			Ordenadores ordenadorDeLaLista = (Ordenadores) producto;
	            			ordenadorDeLaLista.mostrarInformacion();
	            		}
	            	}
            		
	            	break;
	            
	            case 3:
	            	break;
	            
	            case 0:
	            	break;
	            
	            default:
	            	System.out.println("La opción debe estar comprendida entre el 0 y el 3.");
	            	break;
	         
            }	
		}while(opcion != 0);
		System.out.println("Fin de programa.");
		scanner.close(); 
	}

}

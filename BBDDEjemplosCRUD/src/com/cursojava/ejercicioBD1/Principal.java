package com.cursojava.ejercicioBD1;

import entrada.Teclado;

public class Principal {
	
	public static void menu() {
		System.out.println("\n0-Salir del programa.");
		System.out.println("1-Insertar usuario.");
		System.out.println("2-Actualizar nombre de usuario.");
		System.out.println("3-Mostrar datos de usuario.");
		System.out.println("4-Mostrar usuarios con salario > 1800.");
		System.out.println("5-Actualizar datos de un usuario.");
	}

	public static void main(String[] args) {
		int opcion;
		
		do {
			
			menu();
			opcion = Teclado.leerEntero("\n--Introduce la opcion: ");
			
			switch(opcion) {
					
				case 0:
					break;
				
				case 1:
					int codigo = Teclado.leerEntero("Introduce el código del empleado: ");
					if(Metodos.buscarCodigo(codigo)) {
						System.out.println("Ya existe un empleado con ese código.");
						
					}else {
						String nombre = Teclado.leerCadena("Introduce el nombre del empleado: ");
						String apellido = Teclado.leerCadena("Introduce el apellido del empleado: ");
						String fechaNacimiento = Teclado.leerCadena("Introduce la fecha de nacimiento del empleado: ");
						double salario = Teclado.leerReal("Introduce el salario del empleado: ");
						
						boolean insertado = Metodos.insertarEmpleado(codigo, nombre, apellido, fechaNacimiento, salario);
						if(insertado) {
							System.out.println("Se ha insertado un empleado en la base de datos.");
						}
						
					}
					break;
					
				case 2:
					codigo = Teclado.leerEntero("Introduce el código del empleado: ");
					
					if(Metodos.buscarCodigo(codigo)) {
						String nombre = Teclado.leerCadena("Introduce el nombre actualizado del empleado: ");
						
						boolean actualizado = Metodos.actualizarNombreUsuario(codigo, nombre);
						if(actualizado) {
							System.out.println("Se ha actualizado el usuario.");
						}
						
					}else {
						System.out.println("No existe un empleado con ese código.");
					}
					break;
					
				case 3:
					Metodos.mostrarDatos();
					
					break;
					
				case 4:
					Metodos.mostrarDatosPorSalario();
					
					break;
					
				case 5:
					codigo = Teclado.leerEntero("Introduce el código del empleado: ");
					
					if(Metodos.buscarCodigo(codigo)) {
						String nombre = Teclado.leerCadena("Introduce el nombre actualizado del empleado: ");
						String apellido = Teclado.leerCadena("Introduce el apellido actualizado del empleado: ");
						String fechaNacimiento = Teclado.leerCadena("Introduce la fecha de nacimiento actualizada del empleado: ");
						double salario = Teclado.leerReal("Introduce el salario actualizado del empleado: ");
						
						boolean actualizado = Metodos.actualizarUsuario(codigo, nombre, apellido, fechaNacimiento, salario);
						if(actualizado) {
							System.out.println("Se ha actualizado el usuario.");
						}
						
					}else {
						System.out.println("No existe un empleado con ese código.");
					}
					break;
					
				default:
					System.out.println("La opción debe estar comprendida entre 0 y 5.");
					break;
			}

		}while(opcion != 0);
		System.out.println("Fin de programa.");
			
	}
}

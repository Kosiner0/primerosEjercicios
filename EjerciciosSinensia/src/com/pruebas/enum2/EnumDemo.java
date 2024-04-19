package com.pruebas.enum2;

public class EnumDemo {

	public static void main(String[] args) {
		Tutoriales t1, t2, t3;
		
		t1 = Tutoriales.JAVA;
		t2 = Tutoriales.HTML;
		t3 = Tutoriales.MYSQL;
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		System.out.println("lista de tutoriales:");
		
		for(Tutoriales tuto : Tutoriales.values()) {
			System.out.println("\tEl tutorial de " + tuto + " cuesta " + tuto.mostrarPrecio() + "€.");
		}
		System.out.println(Tutoriales.JAVA.ordinal());

	}

}



package com.ejercicios.ejercicio09;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pez pez = new Pez(0);
		
		
		pez.setNombreMascota("Rafa Nadando");
		System.out.println(pez.nombreMascota);
		pez.jugar();
		pez.comer();
		pez.andar();
		
		
	}

}

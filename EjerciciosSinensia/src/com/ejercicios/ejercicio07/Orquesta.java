package com.ejercicios.ejercicio07;

import java.util.ArrayList;
import java.util.List;

public class Orquesta {

	public static void main(String[] args) {
		
		//Lista de instrumentos
		List<Instrumento> instrumentos = new ArrayList<>();
		
		//Creando los instrumentos
		Instrumento flauta = new Flauta("Flauton", "Alargada", "Turbo2000");
		Instrumento guitarra = new Guitarra("Guitarra", "Española", 6);
		Instrumento electrica = new GuitarraElectrica("Guitarra", "Electrica", 4, 1200);
		Instrumento tambor = new Tambor("Tambor", "Percusion", 50);
		
		//Añadiendo los instrumentos a la lista
		instrumentos.add(flauta);
		instrumentos.add(guitarra);
		instrumentos.add(electrica);
		instrumentos.add(tambor);
		
		//Iterando sobre la lista para sacar los instrumentos 
		for(Instrumento instrumento : instrumentos) {
			if(instrumento instanceof Tambor) {
				((Tambor) instrumento).aporrear();
				System.out.println(instrumento.toString() + "\n");

			}else {
				instrumento.tocar();
				instrumento.afinar();
				System.out.println(instrumento.toString() + "\n");
			}
		}
		
	}

}

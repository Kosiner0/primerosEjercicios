package com.ejercicios.ejercicio09;

public class Gato extends Animales implements Mascotas{

	protected String nombreMascota;
	
	
	public Gato(int numeroPatas) {
		super(4);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		super.comer();
		System.out.println("A los gatos les gusta comer peces y arañas.");
	}

	@Override
	public String getNombreMascota() {
		// TODO Auto-generated method stub
		return nombreMascota;
	}

	@Override
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	@Override
	public void jugar() {
		System.out.println("A " + getNombreMascota() + " le gusta jugar con pelotas.");
		
	}

	
	
}

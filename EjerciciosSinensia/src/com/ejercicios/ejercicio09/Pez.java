package com.ejercicios.ejercicio09;

public class Pez extends Animales implements Mascotas{
 
	protected String nombreMascota;
	
	
	public Pez(int numeroPatas) {
		super(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getNombreMascota() {
		// TODO Auto-generated method stub
		return nombreMascota;
	}

	@Override
	public void setNombreMascota(String nombreMascota) {
		// TODO Auto-generated method stub
		this.nombreMascota = nombreMascota;
	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		System.out.println("Estoy nadando.");
		
	}

	@Override
	public void andar() {
		// TODO Auto-generated method stub
		super.andar();
		System.out.println("En realidad no ando, nado.");
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		super.comer();
		System.out.println("Los peces comen plancton.");
	}

	@Override
	public String toString() {
		return "Pez [nombreMascota=" + nombreMascota + ", numeroPatas=" + numeroPatas + "]";
	}
	

}



















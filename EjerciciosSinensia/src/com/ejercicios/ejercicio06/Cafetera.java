package com.ejercicios.ejercicio06;

public class Cafetera {

	protected int capacidadMaxima;
	protected int cantidadActual;
	
	public Cafetera() {
		capacidadMaxima = 1000;
		cantidadActual = 0;
	}
	
	public Cafetera(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = capacidadMaxima;
	}
	
	public Cafetera(int capacidadMaxima, int cantidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = (cantidadActual > capacidadMaxima) ? capacidadMaxima : cantidadActual;
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		if (cantidadActual >= 0 && cantidadActual <= this.capacidadMaxima) {
            this.cantidadActual = cantidadActual;
        } else {
        	this.cantidadActual = this.capacidadMaxima;
        }
	}
	
	@Override
	public String toString() {
		return " Cafetera [capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + "]";
	}

	public void llenarCafetera() {
		this.cantidadActual = this.capacidadMaxima;
	}
	
	public void servirTaza(int cantidadParaServir) {
		
		if(this.cantidadActual > cantidadParaServir) {
			this.cantidadActual -= cantidadParaServir;
		}
		else if(this.cantidadActual < cantidadParaServir) {
			this.cantidadActual = 0;
		}
		else {
			System.out.println(" No queda café en la máquina.");
		}
	}
	
	public void vaciarCafetera() {
		this.cantidadActual = 0;
	}
	
	public void agregarCafe(int cantidadParaAgregar) {
		
		if(this.cantidadActual + cantidadParaAgregar <= this.capacidadMaxima) {
			this.cantidadActual += cantidadParaAgregar;
		}
		else if(this.cantidadActual + cantidadParaAgregar > this.capacidadMaxima) {
			this.cantidadActual = this.capacidadMaxima;
		}
	}
	
	
	public static void main(String[] args) {
		
		Cafetera cafetera1 = new Cafetera();
		Cafetera cafetera2 = new Cafetera(2000);
		Cafetera cafetera3 = new Cafetera(3000, 1500);
		
		System.out.println(cafetera1);
		System.out.println(cafetera2);
		System.out.println(cafetera3);
		
		cafetera1.llenarCafetera();
		System.out.println("\n Llenando cafetera... :" + cafetera1);
		
		cafetera2.servirTaza(1500);
		System.out.println("\n Sirviendo una taza... :" + cafetera2);
		
		cafetera3.vaciarCafetera();
		System.out.println("\n Vaciando cafetera... :" + cafetera3);
		
		cafetera3.agregarCafe(302);
		System.out.println("\n Añadiendo café... :" + cafetera3);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

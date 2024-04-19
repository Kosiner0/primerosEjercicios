package com.ejercicios.ejercicio11;

public class Television extends Electrodomestico{

	private final static double RESOLUCION_BASE = 20;
	private final static boolean SINTONIZADORtdt_BASE = false;
	
	private double resolucion;
	private boolean sintonizadorTDT;
	
	
	public Television() {
		super();
		// TODO Auto-generated constructor stub
		this.resolucion = RESOLUCION_BASE;
		this.sintonizadorTDT = SINTONIZADORtdt_BASE;
	}
	
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
		this.resolucion = RESOLUCION_BASE;
		this.sintonizadorTDT = SINTONIZADORtdt_BASE;
	}
	
	public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		// TODO Auto-generated constructor stub
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public double getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	@Override
	public double precioFinal() {
		// TODO Auto-generated method stub
		super.precioFinal();
		
		if(this.resolucion > 40) {
			precioBase *= 1.3;
		}
		
		if(this.sintonizadorTDT) {
			precioBase += 50;
		}
		return precioBase;
	}

	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + ", precioBase="
				+ precioBase + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + "]";
	}
	
	
}


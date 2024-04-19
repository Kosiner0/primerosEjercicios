package com.ejercicios.ejercicio03;

public class Ordenadores extends Productos{
	
	protected String procesador;
	protected int cantidadMemoria;
	protected int capacidadDiscoDuro;
	
	public Ordenadores(int codigo, String modelo, double precio, int cantidad, String procesador, 
			int cantidadMemoria, int capacidadDiscoDuro) {
		super(codigo, modelo, precio, cantidad);
		this.procesador = procesador;
		this.cantidadMemoria = cantidadMemoria;
		this.capacidadDiscoDuro = capacidadDiscoDuro;
	}
	
	public Ordenadores(int codigo, String modelo, double precio, int cantidad) {
		super(codigo, modelo, precio, cantidad);
		
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public int getCantidadMemoria() {
		return cantidadMemoria;
	}

	public void setCantidadMemoria(int cantidadMemoria) {
		this.cantidadMemoria = cantidadMemoria;
	}

	public int getCapacidadDiscoDuro() {
		return capacidadDiscoDuro;
	}

	public void setCapacidadDiscoDuro(int capacidadDiscoDuro) {
		this.capacidadDiscoDuro = capacidadDiscoDuro;
	}

	@Override
	void mostrarInformacion() {
		System.out.println("Ordenadores [código=" + codigo + ", modelo=" + modelo
				+ ", precio=" + precio + ", cantidad=" + cantidad + "]");
		
	}

	@Override
	public String toString() {
		return "Ordenadores [procesador=" + procesador + ", cantidadMemoria=" + cantidadMemoria
				+ ", capacidadDiscoDuro=" + capacidadDiscoDuro + ", codigo=" + codigo + ", modelo=" + modelo
				+ ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	
	
}

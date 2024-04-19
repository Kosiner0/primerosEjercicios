package com.ejercicios.ejercicio03;

public class Telefonos extends Productos{

	protected String operador;
	
	public Telefonos(int codigo, String modelo, double precio, int cantidad, String operador) {
		super(codigo, modelo, precio, cantidad);
		this.operador = operador;
	}
	
	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	@Override
	void mostrarInformacion() {
		System.out.println("Telefonos [operador=" + operador + ", codigo=" + codigo + ", modelo=" + modelo + ", precio=" + precio
				+ ", cantidad=" + cantidad + "]");
		
	}

}

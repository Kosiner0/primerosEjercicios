package com.ejercicios.ejercicio08;

public class GestionDeImpresion {

	public static void main(String[] args) {
		
		Pagina pagina = new Pagina(120, 1028);
		Factura factura = new Factura(82, 826);
		
		pagina.informeCorto();
		pagina.informeLargo();
		System.out.println();
		factura.informeCorto();
		factura.informeLargo();
		
	}

}

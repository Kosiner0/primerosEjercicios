package com.curso.conversorPesetas;

public class Conversor {

	public double convertirEuroAPeseta(double euros) {
		return euros * 166.386;
	}

	public double convertirPesetaAEuro(double pesetas) {
		return pesetas * 0.00601;
	}

}

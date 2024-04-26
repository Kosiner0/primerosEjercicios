package com.curso.test.conversorPesetas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.curso.conversorPesetas.Conversor;

class ConversorTest {

	@Test
	void euroAPeseta() {
		Conversor conversorPesetas = new Conversor();
		
		/*
			double euroAPeseta = conversorPesetas.convertirEuroAPeseta(20.0);
			assertEquals(3327, euroAPeseta, 0.5);
		*/
		double euroAPeseta = conversorPesetas.convertirEuroAPeseta(20.0);
		assertEquals((20.0 * 166.386), euroAPeseta, 0.5);
		
	}
	
	@Test
	void pesetaAEuro() {
		Conversor conversorPesetas = new Conversor();
		
		double pesetaAEuro = conversorPesetas.convertirPesetaAEuro(20.0);
		assertEquals(0.1, pesetaAEuro, 0.05);
	}

}

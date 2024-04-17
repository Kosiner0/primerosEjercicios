package com.evaluables.primera;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crear un objeto Coche
        Coche miCoche = new Coche("1234ABC");

        // Llamar a algunos métodos definidos en la interfaz Conducible
        miCoche.conducir(); // Iniciar conducción
        miCoche.avanzar(9000); 
        miCoche.retroceder(1); 
        miCoche.avanzar(1001); 
        miCoche.parar(); // Parar el vehículo
		
	}

}

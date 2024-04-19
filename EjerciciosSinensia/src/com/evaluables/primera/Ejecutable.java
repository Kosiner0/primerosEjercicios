package com.evaluables.primera;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crear un objeto Coche
        Coche miCoche = new Coche("1234ABC");
        
        System.out.println("-COCHE-");
        // Llamar a algunos métodos definidos en la interfaz Conducible
        miCoche.conducir(); // Iniciar conducción
        miCoche.avanzar(9000); 
        miCoche.retroceder(1); 
        miCoche.parar(); // Parar el vehículo
        System.out.println("\n");
        System.out.println("" + miCoche.toString());
        
        Camion camion = new Camion("Naranja", "9876ZXY", 10);
        
        System.out.println("\n-CAMIÓN-");
        camion.conducir();
        camion.avanzar(2060);
        camion.retroceder(100);
        camion.avanzar(3018);
        camion.avanzar(937);
        camion.retroceder(150);
        camion.avanzar(504);
        camion.parar();
        System.out.println(camion.getTacometro());
        
        System.out.println("\n");
        System.out.println("" + camion.toString());
	}

}
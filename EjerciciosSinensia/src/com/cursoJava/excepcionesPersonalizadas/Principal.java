package com.cursoJava.excepcionesPersonalizadas;

public class Principal {

    public static void main(String[] args) {
    	
            Cuenta c1 = new Cuenta("Pepito", 20000.00, EstadoCuenta.OPERATIVA);
            
            try {
                    c1.reintegro(-2345);
            } catch (Exception e) {
                    e.printStackTrace();
            }
    }

}

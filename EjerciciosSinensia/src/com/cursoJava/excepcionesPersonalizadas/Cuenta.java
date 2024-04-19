package com.cursoJava.excepcionesPersonalizadas;

public class Cuenta {
    private String titular;
    private double saldo;
    private EstadoCuenta estado;  //EstadoCuenta.OPERATIVA
    
    
    public Cuenta(String titular, double saldo, EstadoCuenta estado) {
            super();
            this.titular = titular;
            this.saldo = saldo;
            this.estado = estado;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public double reintegro(double cantidad) throws Exception {
             if (cantidad <0) { // tendremos que lanzar una excepción personalizada
            	 throw new PersonalizadaExcepcion("La cantidad no puede ser negativa");
            	 
             }else if(EstadoCuenta.BLOQUEADA != null){
            	 throw new PersonalizadaExcepcion("La cuenta está bloqueada, contacte con el banco.");
            	 
             }else {
            	 return saldo -= cantidad;
             }
    }
    
    public double retirarDinero(double cantidad) throws Exception{
    	
    	return 0; 
    }
    
    
    
}

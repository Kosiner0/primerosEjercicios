package com.cursoJava.excepcionesPersonalizadas;

public class PersonalizadaExcepcion extends Exception {
    String texto;

    public PersonalizadaExcepcion(String texto) {
            super();
            this.texto = texto;
    }

    @Override
    public String toString() {
      return "ExceptionPersonalizada [texto=" + texto +"]" ;
    }
    
    
}

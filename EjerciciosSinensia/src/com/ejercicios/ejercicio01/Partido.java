package com.ejercicios.ejercicio01;

class Partido {
	
    private Equipo local;
    private Equipo visitante;
    private int golesLocal;
    private int golesVisitante;

    public Partido(Equipo local, Equipo visitante, int golesLocal, int golesVisitante) {
        this.local = local;
        this.visitante = visitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public void mostrarResultado() {
        System.out.println(local.getNombre() + " " + golesLocal + " - " + golesVisitante + " " + visitante.getNombre());
    }
    
}

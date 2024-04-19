package com.ejercicios.ejercicio01;

class Jugador extends Participante {
    private int goles;

    public Jugador(String nombre) {
        super(nombre);
        this.goles = 0;
    }

    public int getGoles() {
        return goles;
    }

    public void marcarGol(int numGoles) {
        this.goles += numGoles;
    }

    @Override
    void mostrarInformacion() {
        System.out.println("Jugador:" + nombre + ", Goles:" + goles);
    }
}


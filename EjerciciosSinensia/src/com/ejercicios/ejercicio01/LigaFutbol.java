package com.ejercicios.ejercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LigaFutbol {
	
	private List<Partido> partidos;
	private List<Equipo> equipos;
	
	public LigaFutbol() {
		this.partidos = new ArrayList<>();
		this.equipos = new ArrayList<>();
	}
	
	public void agregarPartido(Partido partido) {
		partidos.add(partido);
	}
	
	public void listarPartidos() {
		System.out.println("\n| LISTA DE PARTIDOS |");
		for(Partido partido : partidos) {
			partido.mostrarResultado();
		}
	}
	
	public void agregarEquipo(Equipo equipo) {
		equipos.add(equipo);
	}
	
	public void tablaClasificacionEquipos() {
        Collections.sort(equipos, Comparator.comparing(Equipo::getPartidosGanados).reversed());
        System.out.println("______________________________________");
        System.out.println("|        TABLA DE CLASIFICACIÓN      |");
        for (Equipo equipo : equipos) {
            System.out.println(" " + equipo.getNombre() + " - " + equipo.getPartidosGanados() + " partidos ganados");
        }
	}

	public static void main(String[] args) {
		
		LigaFutbol liga = new LigaFutbol();
		
		Equipo Barça = new Equipo("F.C.Barcelona");
		Equipo Madrid = new Equipo("Real Madrid");
		
		liga.agregarEquipo(Barça);
		liga.agregarEquipo(Madrid);
		
		Jugador messi = new Jugador("Leo Messi");
		Jugador neymar = new Jugador("Neymar Jr.");
		Jugador suarez = new Jugador("Luis Suarez");
		Jugador cr7 = new Jugador("Critiano Ronaldo");
		Jugador bale = new Jugador("Gareth Bale");
		Jugador benzema = new Jugador("Karim Benzema");
		
		Barça.agregarJugador(messi);
		Barça.agregarJugador(neymar);
		Barça.agregarJugador(suarez);
		
		Madrid.agregarJugador(cr7);
		Madrid.agregarJugador(bale);
		Madrid.agregarJugador(benzema);
		
		liga.agregarPartido(new Partido(Barça, Madrid, 3, 2));
		messi.marcarGol(2);
		suarez.marcarGol(1);
		bale.marcarGol(2);
		Barça.ganarPartido();
		
		liga.agregarPartido(new Partido(Barça, Madrid, 1, 3));
		neymar.marcarGol(1);
		cr7.marcarGol(2);
		benzema.marcarGol(1);
		Madrid.ganarPartido();
		
		liga.agregarPartido(new Partido(Barça, Madrid, 2, 3));
		messi.marcarGol(1);
		neymar.marcarGol(1);
		cr7.marcarGol(2);
		benzema.marcarGol(1);
		Madrid.ganarPartido();
		
		liga.agregarPartido(new Partido(Barça, Madrid, 1, 1));
		suarez.marcarGol(1);
		bale.marcarGol(1);
		
		//Muestra la informacion de los equipos
		Barça.mostrarInformacion();
		System.out.println();
		Madrid.mostrarInformacion();
		
		//Muestra la lista de los partidos jugados 
		liga.listarPartidos();
		
		//Muestra la tabla de clasificacion de los equipos en funcion de los partidos ganados
		liga.tablaClasificacionEquipos();
		
	}

}

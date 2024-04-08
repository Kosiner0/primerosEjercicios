package ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class LigaFutbol {
	
	private List<Partido> partidos;
	
	public LigaFutbol() {
		this.partidos = new ArrayList<>();
	}
	
	public void agregarPartido(Partido partido) {
		partidos.add(partido);
	}
	
	public void listarPartidos() {
		System.out.println("-LISTA DE PARTIDOS-");
		for(Partido partido : partidos) {
			partido.mostrarResultado();
		}
	}

	public static void main(String[] args) {
		
		LigaFutbol liga = new LigaFutbol();
		
		Equipo Barça = new Equipo("Barça");
		Equipo Madrid = new Equipo("Madrid");
		
		Barça.agregarJugador(new Jugador("Leo Messi"));
		Barça.agregarJugador(new Jugador("Neymar Jr."));
		Barça.agregarJugador(new Jugador("Luis Suarez"));
		
		Madrid.agregarJugador(new Jugador("Critiano Ronaldo"));
		Madrid.agregarJugador(new Jugador("Gareth Bale"));
		Madrid.agregarJugador(new Jugador("Karim Benzema"));
		
		Barça.mostrarInformacion();
		Madrid.mostrarInformacion();
		
		liga.agregarPartido(new Partido(Barça, Madrid, 3, 2)); 
		liga.agregarPartido(new Partido(Barça, Madrid, 1, 3));
		liga.agregarPartido(new Partido(Barça, Madrid, 2, 2));
		liga.agregarPartido(new Partido(Barça, Madrid, 1, 4));
		
		liga.listarPartidos();

	}

}

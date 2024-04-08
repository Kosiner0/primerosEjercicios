package ejercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Equipo extends Participante{
	
	protected List<Jugador> jugadores;
	
	public Equipo(String nombre) {
		super(nombre);
		this.jugadores = new ArrayList<>();
	}

	 public void agregarJugador(Jugador jugador) {
	        jugadores.add(jugador);
	 }

	public void listarJugadoresPorGoles() {
        Collections.sort(jugadores, Comparator.comparing(Jugador::getGoles).reversed());
        System.out.println("| EQUIPO: " + nombre + " |");
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombre() + ": " + jugador.getGoles() + " goles");
        }
    }
	
	@Override
	void mostrarInformacion() {
		listarJugadoresPorGoles();
		
	}
	

}

package ejercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Equipo extends Participante {
	
	protected List<Jugador> jugadores;
	private int partidosGanados;
	
	public Equipo(String nombre) {
		super(nombre);
		this.jugadores = new ArrayList<>();
		this.partidosGanados = 0;
	}

	 public void agregarJugador(Jugador jugador) {
	        jugadores.add(jugador);
	 }
	 
	 public int getPartidosGanados() {
	        return partidosGanados;
	 }

    public void ganarPartido() {
        partidosGanados++;
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

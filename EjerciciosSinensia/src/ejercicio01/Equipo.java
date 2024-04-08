package ejercicio01;

import java.util.List;

public class Equipo {
	
	protected List<Jugador> jugadores;
	protected String nombre;
	protected int puntos;
	
	public Equipo(List<Jugador> jugadores, String nombre, int puntos) {
		super();
		this.jugadores = jugadores;
		this.nombre = nombre;
		this.puntos = puntos;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Equipo [jugadores=" + jugadores + ", nombre=" + nombre + ", puntos=" + puntos + "]";
	}
	

}

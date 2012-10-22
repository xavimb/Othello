package model;

import java.io.Serializable;
import java.sql.Time;

public class Puntuacion implements Serializable{

	private static final long serialVersionUID = -8883190562636679004L;
	public static final int FACIL = 0;
	public static final int MEDIO = 1;
	public static final int DIFICIL = 2;
	public static final int USER = 3;
	
	private int n;
	private int puntuacion;
	private int victorias;
	private int derrotas;
	private int partidasJugadas;
	private Time tiempo;

	public Puntuacion(int nivel) {
		puntuacion = victorias = derrotas = partidasJugadas = 0;
		n = nivel;
	}
	public void addPuntuacion(int puntuacion, int ganado) {
		partidasJugadas++;
		if (ganado == Partida.GANADO) victorias++;
		else if (ganado == Partida.PERDIDO) derrotas++;
		
		//TODO :seguir
		
	}

}

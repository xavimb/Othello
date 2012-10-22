package model;

public class Partida {
	public static final int GANADO = 0;
	public static final int EMPATADO = 1;
	public static final int PERDIDO = 2;
	
	public static final int J1 = 0;
	public static final int J2 = 1;
	
	Tablero t;
	EstadoJugada[] estados;
	String[] jugadores;
	boolean turno;
	
	public Partida() {
		t = new Tablero();
		estados = new EstadoJugada[2];
		Jugador invitado = new Invitado();
		jugadores = new String[2];
		jugadores[0] = invitado.getUsername();
		jugadores[1] = invitado.getUsername();
		turno = false;
	}

	public String getJugador1() {
		return jugadores[0];
	}

	public void setJugador1(String jugadores) {
		this.jugadores[0] = jugadores;
	}
	
	public String getJugador2() {
		return jugadores[1];
	}

	public void setJugador2(String jugadores) {
		this.jugadores[1] = jugadores;
	}

	public Tablero getTablero() {
		return t;
	}

	public void setTablero(Tablero t) {
		this.t = t;
	}
	
	public void juega(int x, int y) {
		if (turno) {
			t.set(x, y, Casilla.BLANCA);
		} else {
			t.set(x, y, Casilla.NEGRA);
		}
		turno = !turno;
	}
}

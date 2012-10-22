package model;

import java.io.Serializable;

public class Ranking implements Serializable {

	private static final long serialVersionUID = -5322354384876148087L;
	int puntuacion;
	int elo;
	
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	public int getElo() {
		return elo;
	}
	public void calcularElo(int eloRival, boolean haGanado) {
		
	}
	
}

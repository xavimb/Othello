package model;

import java.io.Serializable;
import java.sql.Time;

public class EstadoJugada implements Serializable {

	private static final long serialVersionUID = -531222713850687655L;
	Time tiempo;
	long punts;
	int fitxes;
	
	public EstadoJugada(Time tiempo, long punts, int fitxes) {
		this.tiempo = tiempo;
		this.punts = punts;
		this.fitxes = fitxes;
	}
	public Time getTiempo() {
		return tiempo;
	}
	public void setTiempo(Time tiempo) {
		this.tiempo = tiempo;
	}
	public long getPunts() {
		return punts;
	}
	public void setPunts(long punts) {
		this.punts = punts;
	}
	public int getFitxes() {
		return fitxes;
	}
	public void setFitxes(int fitxes) {
		this.fitxes = fitxes;
	}
}

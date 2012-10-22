package model;

import java.io.Serializable;

public abstract class Jugador implements Serializable {
	
	private static final long serialVersionUID = -8273106874670414697L;
	
	private String username;

	public Jugador(String username) {
		super();
		this.username = username;
	}

	public String getUsername() {
		return username;
	}
	
}

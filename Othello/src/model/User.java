package model;

import java.util.ArrayList;


public class User extends Jugador {
	
	private static final long serialVersionUID = -2792046298025302153L;
	
	String password;
	Ranking r;
	ArrayList<Integer> partidas;
	ArrayList<Puntuacion> n;
	
	public User(String username, String password) {
		super(username);
		this.password = password;
		r = new Ranking();
		partidas = new ArrayList<Integer>();
	}
	public void addPartida(int id) {
		
	}
	public ArrayList<Integer> getPartidas() {
		return partidas;
	}
 }

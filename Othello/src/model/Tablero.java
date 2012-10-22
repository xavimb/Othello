package model;

import java.io.Serializable;



public class Tablero implements Serializable {

	private static final long serialVersionUID = -6220782869189569971L;
	int M[][] = new int[8][8];
	
	
	public Tablero() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				M[i][j] = Casilla.VOID;
			}
		}
		M[3][3] = Casilla.BLANCA;
		M[4][4] = Casilla.BLANCA;
		M[3][4] = Casilla.NEGRA;
		M[4][3] = Casilla.NEGRA;
	}
	
	public void set(int i, int j, int c ) {
		try {
			M[i][j] = c;
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Index out of bounds! Estas metiendo un numero fuera del rango de la tabla!");
		}
		
	}
	public int get(int i, int j) {
		try {
			return M[i][j];
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Index out of bounds! Estas metiendo un numero fuera del rango de la tabla!");
		}
		return -1;
	}
	
	
}

package logics;


public class IA {
	/*static private BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1);

	public void tiraBlanca() {
		int i,j;
		i=j=0;
		//do {
			System.out.println("On vols tirar blanca? (fila)");
			String linea;
			try {
				linea = br.readLine();
				i = Integer.parseInt( linea )-1;
			} catch (IOException e) {
				
			}
			
			System.out.println("On vols tirar Negre? (columna)");
			try {
				linea = br.readLine();
				j = Integer.parseInt( linea )-1;
			} catch (IOException e) {
				
			}
		//} while (!Pot_tirar(i,j,'O','X'));
		M[i][j] = 'O';
		compruebaHorizontal(i,j,'O','X');
		compruebaVertical(i,j,'O','X');
		compruebaDiagonal(i,j,'O','X');
		
	}
	private boolean potTirar(int i, int j, char c1, char c2) {
		if (i != 0) {
			if (M[i-1][j] == c2) {
				for (int k = i-2; k >= 0; k--) {
					if (M[k][j] == c1) {
						return true;
					}
				}
			}
		}
		if (i != 7) {
			if (M[i+1][j] == c2) {
				for (int k = i+2; k <= 7; k++) {
					if (M[k][j] == c1) {
						return true;
					}
				}
			}
		}
		if (j != 0) {
			if (M[i][j-1] == c2) {
				for (int k = j-2; k >= 0; k--) {
					if (M[i][k] == c1) {
						return true;
					}
				}
			}
		}
		if (j != 7) {
			if (M[i][j+1] == c2) {
				for (int k = j+2; k <= 7; k++) {
					if (M[i][k] == c1) {
						return true;
					}
				}
			}
		}
		if (i > 1 && j > 1) {
			if (M[i-1][j-1] == c2) {
				for (int k = 2; i >= k && j >= k; k++) {
					if (M[i-k][j-k] == c1) {
						return true;
					}
				}
			}
		}
		if (i < 6 && j < 6) {
			if (M[i+1][j+1] == c2) {
				for (int k = 2; i+k <= 7 && j+k <= 7; k++) {
					if (M[i+k][j+k] == c1) {
						return true;
					}
				}
			}
		}
		if (i > 1 && j < 6) {
			if (M[i-1][j+1] == c2) {
				for (int k = 2; i >= k && j+k <= 7; k++) {
					if (M[i-k][j+k] == c1) {
						return true;
					}
				}
			}
		}
		if (i < 6 && j > 1) {
			if (M[i+1][j-1] == c2) {
				for (int k = 2; i+k <= 7 && j >= k; k++) {
					if (M[i+k][j-k] == c1) {
						return true;
					}
				}
			}
		}
		return false;
	}
	//Mira en las diagonales cuales se pueden voltear, y llama a voltea
	//indicando de donde a donde a de voltear
	//char c1 ha de ser el color del que pone la pieza
	//char c2 ha de ser el color de las piezas enemigas
	//i,j indica las coordenadas en donde ponemos la pieza de color c1
	private void compruebaDiagonal(int i, int j, char c1, char c2) {
		if (i > 1 && j > 1) {
			if (M[i-1][j-1] == c2) {
				for (int k = 2; i >= k && j >= k; k++) {
					if (M[i-k][j-k] == c1) {
						voltea(i-k+1,j-k+1,i-1,j-1);
						k = 8;
					}
				}
			}
		}
		if (i < 6 && j < 6) {
			if (M[i+1][j+1] == c2) {
				for (int k = 2; i+k <= 7 && j+k <= 7; k++) {
					if (M[i+k][j+k] == c1) {
						voltea(i+1,j+1,i+k-1,j+k-1);
						k = 8;
					}
				}
			}
		}
		if (i > 1 && j < 6) {
			if (M[i-1][j+1] == c2) {
				for (int k = 2; i >= k && j+k <= 7; k++) {
					if (M[i-k][j+k] == c1) {
						voltea(i-1,j+1,i-k+1,j+k-1);
						k = 8;
					}
				}
			}
		}
		if (i < 6 && j > 1) {
			if (M[i+1][j-1] == c2) {
				for (int k = 2; i+k <= 7 && j >= k; k++) {
					if (M[i+k][j-k] == c1) {
						voltea(i+k-1,j-k+1,i+1,j-1);
						k = 8;
					}
				}
			}
		}
	}
	private void compruebaVertical(int i, int j, char c1, char c2) {
		if (i != 0) {
			if (M[i-1][j] == c2) {
				for (int k = i-2; k >= 0; k--) {
					if (M[k][j] == c1) {
						voltea(k+1,j,i-1,j);
						k = -1;
					}
				}
			}
		}
		if (i != 7) {
			if (M[i+1][j] == c2) {
				for (int k = i+2; k <= 7; k++) {
					if (M[k][j] == c1) {
						voltea(i+1,j,k-1,j);
						k = 8;
					}
				}
			}
		}
	}
	private void compruebaHorizontal(int i, int j, char c1, char c2) {
		if (j != 0) {
			if (M[i][j-1] == c2) {
				for (int k = j-2; k >= 0; k--) {
					if (M[i][k] == c1) {
						voltea(i,k+1,i,j-1);
						k = -1;
					}
				}
			}
		}
		if (j != 7) {
			if (M[i][j+1] == c2) {
				for (int k = j+2; k <= 7; k++) {
					if (M[i][k] == c1) {
						voltea(i,j+1,i,k-1);
						k = 8;
					}
				}
			}
		}
	}
	public void tiraNegra() {
		int i,j;
		i = j = 0;
		//do {
			System.out.println("On vols tirar Negre? (fila)");
			String linea;
			try {
				linea = br.readLine();
				i = Integer.parseInt( linea )-1;
			} catch (IOException e) {
				
			}
			
			System.out.println("On vols tirar Negre? (columna)");
			try {
				linea = br.readLine();
				j = Integer.parseInt( linea )-1;
			} catch (IOException e) {
				
			}
		//} while (!Pot_tirar(i,j,'X','O'));
		M[i][j] = 'X';
		compruebaHorizontal(i,j,'X','O');
		compruebaVertical(i,j,'X','O');
		compruebaDiagonal(i,j,'X','O');
		mostrar();
	}
	//Importante, si i1=i2 i/o j1=j2, siempre x1 < x2
	//En el caso de diagonales, j1 < j2 siempre!
	public void voltea(int i1, int j1, int i2, int j2) {
		System.out.println("Ha entrado en voltea: "+i1+" y "+j1+","+i2+" y "+j2);
		if (i1 == i2 && j1 == j2) {
			System.out.println("Ha entrado en voltea iguales");
			if (M[i1][j1] == 'O') M[i1][j1] = 'X';
			else if (M[i1][j1] == 'X') M[i1][j1] = 'O';
		}
		else if (j1 == j2) {
			for (int k = i1; k <= i2; k++) {
				if (M[k][j1] == 'O') M[k][j1] = 'X';
				else if (M[k][j1] == 'X') M[k][j1] = 'O';
			}		
		}
		else if (i1 == i2) {
			for (int l = j1; l <= j2; l++) {
				if (M[i1][l] == 'O') M[i1][l] = 'X';
				else if (M[i1][l] == 'X') M[i1][l] = 'O';
			}
		}
		else {
			if (i1 > i2) { 	//Diagonal descendente
				System.out.println("Diagonal aparente ascendente");
				int aux = i1;
				for (int k = j1; k <= j2 && aux >= i2; k++) {
					if (M[aux][k] == 'O') M[aux][k] = 'X';
					else if (M[aux][k] == 'X') M[aux][k] = 'O';
					aux--;
				}
			}
			else {			//Diagonal ascendente
				System.out.println("Diagonal aparente descendente");
				int aux = i1;
				for (int k = j1; k <= j2 && aux <= i2; k++) {
					if (M[aux][k] == 'O') M[aux][k] = 'X';
					else if (M[aux][k] == 'X') M[aux][k] = 'O';
					aux++;
				}
			}
		}
	}
*/
}

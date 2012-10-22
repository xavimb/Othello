package awt;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import model.Casilla;
import model.Tablero;

public class WTablero extends JPanel {

	private static final long serialVersionUID = -249841185850816055L;
	
	private Tablero t;
	private int[][] c;
	
	
	public WTablero () {
		super();
		t = new Tablero();
		c = new int[8][8];
		
	}
	
	public void setTablero(Tablero tab) {
		t = tab;
	}

	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = (this.getWidth())/8;
        //System.out.println(this.getWidth());
        for (int i=0; i<8; i++) {
        	for (int j=0; j<8; j++) {
        		g.setColor(Color.WHITE);
        		g.fillRect(i*w, j*w, w-1, w-1);
        	}
        }
        for (int i=0; i<8; i++) {
        	for (int j=0; j<8; j++) {
        		if (t.get(i,j) == Casilla.BLANCA) {
        			g.setColor(Color.WHITE);
        			g.fillOval(i*w, j*w, w, w);
        			g.setColor(Color.BLACK);
        			g.drawOval(i*w, j*w, w, w);
        		} else if (t.get(i, j) == Casilla.NEGRA) {
        			g.setColor(Color.BLACK);
        			g.fillOval(i*w, j*w, w, w);
        			
        		}
        		//add(c[i][j]);
        	}
        }
     }

}

package awt;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Casilla;
import model.Partida;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.Box;
import java.awt.Font;
import java.awt.Component;

public class WPartida extends JFrame {

	private JPanel panel;
	private JPanel tablero;
	private Partida partida;
	private Box verticalBox;
	private JLabel lblNfichas;
	private Box verticalBox_1;
	private JLabel lblJugador_1;
	private JLabel lblFichas_1;
	private JLabel lblNfichas_1;
	private Component horizontalStrut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WPartida frame = new WPartida();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public WPartida() {
		initialize();
	}
	private void initialize () {
		
		partida = new Partida();
		
		setMinimumSize(new Dimension(1024, 800));
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 238));
		panel.setBounds(6, 6, 206, 766);
		//tablero.setTablero(partida.getTablero());
		
		
		getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		verticalBox = Box.createVerticalBox();
		panel.add(verticalBox);
		
		JLabel lblJugador = new JLabel("Jugador 1");
		lblJugador.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		verticalBox.add(lblJugador);
		
		JLabel lblFichas = new JLabel("Fichas:");
		verticalBox.add(lblFichas);
		
		lblNfichas = new JLabel("0");
		lblNfichas.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		verticalBox.add(lblNfichas);
		
		horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setMinimumSize(new Dimension(30, 0));
		panel.add(horizontalStrut);
		
		verticalBox_1 = Box.createVerticalBox();
		verticalBox_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel.add(verticalBox_1);
		
		lblJugador_1 = new JLabel("Jugador 2");
		lblJugador_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		verticalBox_1.add(lblJugador_1);
		
		lblFichas_1 = new JLabel("Fichas:");
		verticalBox_1.add(lblFichas_1);
		
		lblNfichas_1 = new JLabel("0");
		lblNfichas_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		verticalBox_1.add(lblNfichas_1);
		
		tablero = new WTablero();
		tablero.setBounds(306, 94, 600, 600);
		tablero.addMouseListener(new PartidaListener());
		getContentPane().add(tablero);
		
		//mostrar();
	}
	public void mostrar() {
		System.out.print("---------------------------------\n");
		for (int j = 0; j < 8; j++) {
			System.out.print(":");
			for (int i = 0; i < 8; i++) {
					if (partida.getTablero().get(i, j) == Casilla.BLANCA) {
						System.out.print(" O :");
					} else if (partida.getTablero().get(i, j) == Casilla.NEGRA) {
						System.out.print(" X :");
					} else if (partida.getTablero().get(i, j) == Casilla.POSSIBLE) {
						System.out.print(" á :");
					} else {
						System.out.print("   :");
					}
			}
			int aux = j+1;
			System.out.print(" "+aux+"\n");
			System.out.print("---------------------------------\n");
		}
		System.out.print("  1   2   3   4   5   6   7   8  \n");
	}
	class PartidaListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			int casillaX = e.getX()/(e.getComponent().getWidth()/8);
			int casillaY = e.getY()/(e.getComponent().getWidth()/8);
			
			partida.juega(casillaX, casillaY);
			mostrar();
			e.getComponent().repaint();
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		
	}
}

package game3;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import game2.MainBoard.MyAdapter;

public class GameBoard extends JPanel implements ActionListener{

	private Gamer gamer ;
	private final int delay = 10;
	private Timer timer;
	private Enemy enemy;

	public GameBoard() {
		setFocusable(true);
		gamer = new Gamer(150, 150, 50, 50);
		enemy = new Enemy(2, 5, 50, 50);
		
		MyAdapter adapter = new MyAdapter();
		addKeyListener(adapter);
		
		timer = new Timer(delay, this);
		timer.start();
	}

	private void initGameBoard() {
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillRect(gamer.getX(), gamer.getY(), gamer.getWidth(), gamer.getHeight());
		g.fillRect(enemy.getX(), enemy.getY(), enemy.getWidth(), enemy.getHeight());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		enemy.move();
		gamer.move();
		repaint();
	}

	private class MyAdapter implements KeyListener {
		@Override
		public void keyPressed(KeyEvent e) {
			gamer.keyPressed(e);	
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			gamer.keyReleased(e);
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}

}

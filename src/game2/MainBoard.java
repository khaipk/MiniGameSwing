package game2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class MainBoard extends JPanel implements ActionListener {
	private Table table;
	private Timer timer;
	private final int delay = 10;
	private Ball ball;
	private int score =0;
	
	public MainBoard() {
		
		setFocusable(true);
		setBackground(Color.LIGHT_GRAY);
		
		table = new Table(50, 500, 80, 20);
		ball = new Ball(50, 50, 20, 20);
		
		MyAdapter adapter = new MyAdapter();
		addKeyListener(adapter);
		
		timer = new Timer(delay, this);
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		colision();
		ball.move();
		table.move();
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillRect(table.getX(), table.getY(), table.getWidth(), table.getHeight());
		g.fillOval(ball.getX(), ball.getY(), ball.getWidth(), ball.getHeight());
		g.drawString("Score: "+score, 5, 15);
	}
	
	public void colision() {
		Rectangle tab = table.getBounds();
		Rectangle bal = ball.getBounds();
		if(bal.intersects(tab)) {
			score++;
			ball.moveUp();
		}
	}
	
	public class MyAdapter implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			table.keyPressed(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			table.keyReleased(e);
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}

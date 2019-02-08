package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class MainGame extends JPanel implements ActionListener {

	private Timer timer;
	private Pic pic;
	private final int delay = 10;
	
	public MainGame() {
		setFocusable(true);
		setBackground(Color.WHITE);
		pic = new Pic();
		MyAdapter adapter = new MyAdapter(pic);
		addKeyListener(adapter);
		timer = new Timer(delay, this);
		timer.start();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(pic.getImage(), pic.getX(), pic.getY(), this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		pic.move();
		repaint();
	}
	
}

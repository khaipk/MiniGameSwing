package game;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class MainGame2 extends JPanel implements ActionListener{
	private Pic pic2;
	private final int delay = 10;
	private Timer timer;
	
	public MainGame2() {
		setFocusable(true);
		setBackground(Color.WHITE);
		pic2 = new Pic();
		MyAdapter2 adapter = new MyAdapter2(pic2);
		addKeyListener(adapter);
		timer = new Timer(delay, this);
		timer.start();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(pic2.getImage(), pic2.getX(), pic2.getY(), this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		pic2.move();
		repaint();
	}
}

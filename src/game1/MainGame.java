package game1;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JPanel;
import javax.swing.Timer;

public class MainGame extends JPanel implements ActionListener {
	private Me me;
	private Enemies enemy1, enemy2, enemy3, enemy4;
	private final int delay = 10;
	private Timer timer;
	private int health = 100;
	private Health blood;
	
	public MainGame() {
		me = new Me(50, 50, 50, 50);
		enemy1 = new Enemies(50, 50, 50, 50);
		enemy2 = new Enemies(50, 250, 50, 50);
		enemy3 = new Enemies(150, 50, 50, 50);
		enemy4 = new Enemies(250, 350, 50, 50);
		blood = new Health(250, 250, 30, 30);
		
		addMouseMotionListener(new MyAdapter());
		timer = new Timer(delay, this);
		timer.start();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(me.getX(), me.getY(), me.getWidth(), me.getHeight());
		g.drawRect(enemy1.getX(), enemy1.getY(), enemy1.getWidth(), enemy1.getHeight());
		g.drawRect(enemy2.getX(), enemy2.getY(), enemy2.getWidth(), enemy2.getHeight());
		g.drawRect(enemy3.getX(), enemy3.getY(), enemy3.getWidth(), enemy3.getHeight());
		g.drawRect(enemy4.getX(), enemy4.getY(), enemy4.getWidth(), enemy4.getHeight());
		g.drawRect(blood.getX(), blood.getY(), blood.getWidth(), blood.getHeight());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		checkCollision();
		me.move();
		enemy1.moveX();
		enemy2.moveY();
		enemy3.moveX();
		enemy4.moveY();
		repaint();
	}
	
	public void checkCollision() {
		Rectangle my = me.getItems();
		Rectangle e1 = enemy1.getItems();
		Rectangle e2 = enemy2.getItems();
		Rectangle e3 = enemy3.getItems();
		Rectangle e4 = enemy4.getItems();
		Rectangle heart = blood.getItems();
		
		if (my.intersects(heart)) {
			health += 1;
			blood.setX(1000);
			blood.setY(1000);
		}
		
		if (my.intersects(e4) || my.intersects(e3) || my.intersects(e2) || my.intersects(e1)) {
			health --;
		}
		while(health==0) {
			timer.stop();
		}
	}
	
	private class MyAdapter extends MouseMotionAdapter {
		@Override
		public void mouseMoved(MouseEvent e) {
			me.mouseMoved(e);
		}
	}
}

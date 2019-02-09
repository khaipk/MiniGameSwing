package game2;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

public class Table extends Spite{
	
	private int dx;
	
	public Table(int x, int y, int width, int height) {
		super(x, y, width, height);
		x = 50;
		y = 500;
		width = 80;
		height = 20;
	}
	
	public void move() {
		x+= dx;
	}

	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		switch (key) {
		case KeyEvent.VK_A:
			dx = -5;
			break;
		case KeyEvent.VK_D:
			dx = 5;
			break;
		default:
			break;
		}
	}

	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		switch (key) {
		case KeyEvent.VK_A:
			dx = 0;
			break;
		case KeyEvent.VK_D:
			dx = 0;
			break;
		default:
			break;
		}
		
	}

	
	

}

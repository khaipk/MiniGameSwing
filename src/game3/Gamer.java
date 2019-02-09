package game3;

import java.awt.event.KeyEvent;

public class Gamer extends Items {
	
	public void move() {
		x += dx;
		y += dy;
	}

	public void keyPressed(KeyEvent e) {
		
		int key = e.getKeyCode();
		switch (key) {
		case KeyEvent.VK_A:
			dx = -5;
			break;
		case KeyEvent.VK_S:
			dy = 3;
			break;
		case KeyEvent.VK_D:
			dx = 5;
			break;
		case KeyEvent.VK_W:
			dy = -3;
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
		case KeyEvent.VK_S:
			dy = 0;
			break;
		case KeyEvent.VK_D:
			dx = 0;
			break;
		case KeyEvent.VK_W:
			dy = 0;
			break;

		default:
			break;
		}
	}
	
	public Gamer(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

}

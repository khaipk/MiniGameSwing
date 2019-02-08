package game;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Pic2 extends JPanel{
	
	private Image cute ;
	private int x;
	private int y;
	private int dx;
	private int dy;
	private final int speed = 1;

	public Pic2() {
		ImageIcon image = new ImageIcon("image/cute.jpg");
		cute = image.getImage();
		x = 10;
		y = 10;
	}
	public void move() {
		x += dx;
		y += dy;
	}
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		switch (key) {
		case KeyEvent.VK_A:
			dx = -speed;
			break;
		case KeyEvent.VK_S:
			dy = speed;
			break;
		case KeyEvent.VK_D:
			dx = speed;
			break;
		case KeyEvent.VK_W:
			dy = -speed;
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
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Image getImage() {
		return cute;
	}
}

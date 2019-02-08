package game;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Pic extends JPanel{

	private Image sexy;
	private int x;
	private int y;
	private int dx;
	private int dy;
	private final int speed = 1;

	public Pic() {
		ImageIcon image = new ImageIcon("image/sexy.jpg");
		sexy = image.getImage();
		x = 50;
		y = 50;
	}

	public void move() {
		x+=dx;
		y+=dy;
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		switch (key) {
		case KeyEvent.VK_UP:
			dy = -speed;
			break;
		case KeyEvent.VK_DOWN:
			dy = speed;
			break;
		case KeyEvent.VK_LEFT:
			dx = -speed;
			break;
		case KeyEvent.VK_RIGHT:
			dx = speed;
			break;

		default:
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		switch (key) {
		case KeyEvent.VK_UP:
			dy = 0;
			break;
		case KeyEvent.VK_DOWN:
			dy = 0;
			break;
		case KeyEvent.VK_LEFT:
			dx = 0;
			break;
		case KeyEvent.VK_RIGHT:
			dx = 0;
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
		return sexy;
	}
}

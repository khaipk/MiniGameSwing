package game3;

import java.awt.Rectangle;

public class Items {
	
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected int speed;
	protected int dx;
	protected int dy;
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, width, height);
	}
	public Items(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}

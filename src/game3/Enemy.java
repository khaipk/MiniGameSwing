package game3;

public class Enemy extends Items {
	private int dx=10, dy=10;
	public void move() {
		speed = 3;
		if(x<0) dx = speed;
		if(x>500) dx = -speed;
		if(y<0) dy = speed*2;
		if(y>500) dy = -speed;
		x+=dx;
		y+=dy;
	}

	public Enemy(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

}

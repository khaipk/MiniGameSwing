package game2;

public class Ball extends Spite {
	
	private int speed = 2, spee =3, dx =3, dy=3;
	
	public Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	public void move() {
		
		if(x<0 ) {
			dx = speed;
		}
		if(x>500) {
			dx = -speed;
		}
		if(y<0) {
			dy = spee;
		}
		if(y>530) {
			dx = 0;
			dy = 0;
		}
		x += dx;
		y += dy;
	}
	public void moveUp() {
		spee ++;
		dy = -spee;
	}
	
}

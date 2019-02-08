package game1;

import java.util.Random;

public class Enemies extends Items {
	
	private int dx;
	private int dy;
	private int speed =1;

	public Enemies(int x, int y, int height, int width) {
		super(x, y, height, width);
	}
	
	public void moveX() {
		dx = speed;
		if(x>500 ) {
			Random rd = new Random();
			speed = rd.nextInt(2)-2;
		}
		if(x<0) {
			Random rd = new Random();
			speed = rd.nextInt(2)+1;;
		}
		x += dx;
	}
	
	public void moveY() {
		dy = speed;
		if(y<0) {
			Random rd = new Random();
			speed =rd.nextInt(2)+1;
		}
		if(y>500) {
			Random rd = new Random();
			speed = rd.nextInt(2)-2;
		}
		y += dy;
	}
	
	/*public void randomMove() {
		Random rd = new Random();
		dx = rd.nextInt(3)-2;
		dy = rd.nextInt(3)-2;
	}*/
	
}

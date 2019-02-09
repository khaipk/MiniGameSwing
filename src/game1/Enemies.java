package game1;

import java.util.Random;

public class Enemies extends Items {
	
	private int dx;
	private int dy;
	private int speedx =1;
	private int speedy =1;

	public Enemies(int x, int y, int height, int width) {
		super(x, y, height, width);
	}
	
	public void move() {
		dx = speedx;
		dy = speedy *1;
		
		if(x>450 ) {
			Random rd = new Random();
			speedx = rd.nextInt(2)-2;
		}
		if(x<0) {
			Random rd = new Random();
			speedx = rd.nextInt(2)+1;;
		}
		
		if(y<0) {
			Random rd = new Random();
			speedy =rd.nextInt(2)+1;
		}
		if(y>450) {
			Random rd = new Random();
			speedy = rd.nextInt(2)-2;
		}
		
		x += dx;
		y += dy;
	}
	
	/*public void randomMove() {
		Random rd = new Random();
		dx = rd.nextInt(3)-2;
		dy = rd.nextInt(3)-2;
	}*/
	
}

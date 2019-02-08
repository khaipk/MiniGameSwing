package game1;

import java.awt.event.MouseEvent;

public class Me extends Items {
	
	private int mx;
	private int my;

	public Me(int x, int y, int height, int width) {
		super(x, y, height, width);
	}
	public void move() {
		x = mx;
		y = my;
	}
	public void mouseMoved(MouseEvent e) {
		mx = e.getX();
		my = e.getY();
	}
}

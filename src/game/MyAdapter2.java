package game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyAdapter2 extends KeyAdapter{
	private Pic pic2;
	
	public MyAdapter2(Pic pic) {
		this.pic2 = pic;
	}
	@Override
	public void keyPressed(KeyEvent e) {
		pic2.keyPressed(e);
	}
	@Override
	public void keyReleased(KeyEvent e) {
		pic2.keyReleased(e);
	}
}

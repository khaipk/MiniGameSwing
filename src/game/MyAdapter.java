package game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyAdapter extends KeyAdapter {
	
	private Pic pic;
	
	public MyAdapter(Pic pic) {
		this.pic = pic;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		pic.keyPressed(e);
	}
	@Override
	public void keyReleased(KeyEvent e) {
		pic.keyReleased(e);
	}
	
}

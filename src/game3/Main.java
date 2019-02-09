package game3;

import javax.swing.JFrame;

public class Main extends JFrame{

	public static void main(String[] args) {
		new Main().setVisible(true);
	}
	
	public Main() {
		setTitle("Test Game");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(new GameBoard());
		setLocationRelativeTo(null);
		setSize(300, 300);
		
	}
}

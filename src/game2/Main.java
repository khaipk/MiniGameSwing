package game2;

import javax.swing.JFrame;

public class Main extends JFrame{

	public static void main(String[] args) {
		new Main().setVisible(true);
	}
	
	public Main() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(600, 600);
		add(new MainBoard());
		setTitle("Ping Pong Game");
		setLocationRelativeTo(null);
	}

}

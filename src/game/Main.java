package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Main().setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		add(new MainGame());
		setSize(500, 500);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}

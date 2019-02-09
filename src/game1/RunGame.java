package game1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class RunGame extends JFrame {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new RunGame().setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public RunGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		add(new MainGame());
		setSize(500, 500);
		setLocationRelativeTo(null);
	}

}

package main;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		JFrame window = new JFrame("tetris");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		
		GamePanel GP = new GamePanel();
		window.add(GP);
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		GP.launchGame();
	}

}

package main;

import javax.swing.JFrame;

public class GameWindow {
	private JFrame jframe;
	
	public GameWindow(GamePanel gamePanel){
		
		jframe = new JFrame();
		
		jframe.setSize(400, 400);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);//carpiya basinca kapanmasini saglar
		jframe.add(gamePanel);
		
		jframe.setVisible(true);
	}
}

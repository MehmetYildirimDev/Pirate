package main;

import javax.swing.JFrame;

public class GameWindow {
	private JFrame jframe;
	
	public GameWindow(){
		
		jframe = new JFrame();
		
		jframe.setSize(400, 400);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);//carpiya basinca kapanmasini saglar
	}
}

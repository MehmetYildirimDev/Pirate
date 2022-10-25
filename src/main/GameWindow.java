package main;

import javax.swing.JFrame;

public class GameWindow {
	private JFrame jframe;
	
	public GameWindow(GamePanel gamePanel){
		
		jframe = new JFrame();
		
		
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);//carpiya basinca kapanmasini saglar
		jframe.add(gamePanel);
		jframe.setLocationRelativeTo(null);
		jframe.setResizable(false);//yeniden boyutlanamaz
		jframe.pack();//paneli pencereye sigdir diyoruz burada
		jframe.setVisible(true);
		
	}
}

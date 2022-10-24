package main;

public class Game {

	private GameWindow gameWindow;
	private GamePanel gamePanel;
	
	public Game() {//constructer
		gamePanel = new GamePanel(); 
		gameWindow = new GameWindow(gamePanel);
		
	}
	
}

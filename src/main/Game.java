package main;

public class Game implements Runnable {

	private GameWindow gameWindow;
	private GamePanel gamePanel;
	private Thread gameThread;
	private final int FPS_SET = 120;
	
	public Game() {//constructer
		gamePanel = new GamePanel(); 
		gameWindow = new GameWindow(gamePanel);
		gamePanel.requestFocus();//giris odagi veriliyo
		startGameLoop();
	}

	private void startGameLoop() {
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	
	public void run() {
		double timePerFrame = 1000000000.0/ FPS_SET; //1 saniye = 1000000000.0 nanosaniye
		long lastFrame = System.nanoTime();
		long now= System.nanoTime();
		int frames =0;
		long lastcheck = System.currentTimeMillis();
		
		while (true) {
		
			now = System.nanoTime();
			if(now - lastFrame >= timePerFrame) {
				gamePanel.repaint();
				lastFrame = System.nanoTime();
				frames++;
			}
			
			
			if(System.currentTimeMillis()- lastcheck>=1000){//1second = 1000ms
				lastcheck = System.currentTimeMillis();
				System.out.println("fps: " + frames);
				frames = 0;
			}
			
		}
		
		
	}
	
}

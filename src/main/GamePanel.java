package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JPanel;

import inputs.Mouseinputs;
import inputs.keyboardinputs;

public class GamePanel extends JPanel{

	private Mouseinputs mouseinputs;
	private float xDelta=100 ,yDelta=100;
	private float xDir = 3f,yDir = 3f; 
	private int frames = 0;
	private long lastcheck = 0;
	private Color color = new Color(150,20,90);
	private Random random;

	public GamePanel() {
		random = new Random();
		mouseinputs = new Mouseinputs(this);//herhangi bir hata olmasin diye boyle yaptik
		addKeyListener(new keyboardinputs(this));
		addMouseListener(mouseinputs);
		addMouseMotionListener(mouseinputs);
	}

	public void changexDelta(int value) {
		this.xDelta +=value; 
	}

	public void changeyDelta(int value) {
		this.yDelta +=value; 
	}

	public void setRectPos(int x, int y) {
		this.xDelta = x;
		this.yDelta = y; 
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		updateRectangle();

		g.setColor(color);

		g.fillRect((int)xDelta, (int)yDelta, 200, 50);


	}

	private void updateRectangle() {
		
		xDelta+= xDir;
		if(xDelta > 400 || xDelta < 0){//cercevemizin buyuklugu
			xDir *= -1; //400 gecers yonu ters ceviriyoruz
			color = getRndmColor();
		}


		yDelta+= yDir;
		if(yDelta >400 || yDelta < 0) {
			yDir *= -1;
			color = getRndmColor();
		}



	}

	private Color getRndmColor() {
		int r =random.nextInt(255);//0 ile 255 arasi
		int b =random.nextInt(255);
		int g =random.nextInt(255);


		return new Color(r, g, b);
	}


}

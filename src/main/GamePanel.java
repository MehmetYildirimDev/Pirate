package main;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import inputs.Mouseinputs;
import inputs.keyboardinputs;

public class GamePanel extends JPanel{

	private Mouseinputs mouseinputs;
	private int xDelta=100 ,yDelta=100;
	
	public GamePanel() {
		mouseinputs = new Mouseinputs(this);//herhangi bir hata olmasin diye boyle yaptik
		addKeyListener(new keyboardinputs(this));
		addMouseListener(mouseinputs);
		addMouseMotionListener(mouseinputs);
	}
	
	public void changexDelta(int value) {
		this.xDelta +=value; 
		repaint();//yenden ciz diyoruz
	}
	
	public void changeyDelta(int value) {
		this.yDelta +=value; 
		repaint();
	}
	
	public void setRectPos(int x, int y) {
		this.xDelta = x;
		this.yDelta = y;
		repaint();
	}
	
	public void paintComponent(Graphics g) {
			 super.paintComponent(g);
			 
			 g.fillRect(xDelta, yDelta, 200, 50);
	}
	
	
}

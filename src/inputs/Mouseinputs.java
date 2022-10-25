package inputs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import main.GamePanel;

public class Mouseinputs implements MouseListener,MouseMotionListener {

	
	private GamePanel gamePanel;
	public Mouseinputs (GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}
	
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent e) {
		gamePanel.setRectPos(e.getX(), e.getY());
		
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("click");
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
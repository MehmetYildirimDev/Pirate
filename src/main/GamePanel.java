package main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import inputs.Mouseinputs;
import inputs.keyboardinputs;

public class GamePanel extends JPanel{

	private Mouseinputs mouseinputs;
	private float xDelta=100 ,yDelta=100;
	private BufferedImage img,subImg; 




	public GamePanel() {
		

		mouseinputs = new Mouseinputs(this);//herhangi bir hata olmasin diye boyle yaptik
		
		importImg();
		setPanelSize();
		addKeyListener(new keyboardinputs(this));
		addMouseListener(mouseinputs);
		addMouseMotionListener(mouseinputs);
	}

	private void importImg() {
		InputStream is = getClass().getResourceAsStream("/player_sprites.png");
		try {
			img = ImageIO.read(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void setPanelSize() {
		Dimension size = new Dimension(1280,720);
		setMinimumSize(size);
		setPreferredSize(size);
		setMaximumSize(size);
		
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
		
		subImg = img.getSubimage(1*64, 8*40 , 64, 40);
		
		g.drawImage(subImg, (int)xDelta, (int)yDelta, 128, 80, null);
		//subget ile belirli bir kismini aliyoruz /// baslangic yeri //// boyutlandırıyoruz 
		
	}


}
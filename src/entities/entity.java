package entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public abstract class entity {

	protected float x,y;
	protected int width,height;
	protected Rectangle2D.Float hitbox;//diktortgen
	
	public entity(float x, float y, int widht, int height){
		this.x = x;
		this.y = y;
		this.width = widht;
		this.height = height;
		
	}

	protected void drawHitbox(Graphics g) {
		g.setColor(Color.PINK);
		g.drawRect((int)hitbox.x, (int)hitbox.y,(int) hitbox.width, (int)hitbox.height);
	}
	
	 protected void initHitbox(float x, float y, float widht, float height) {
		hitbox = new Rectangle2D.Float(x,y,widht,height); 
	}
	 
//	 protected void updateHitbox() {//konumu surekli guncelliyoruz
//		hitbox.x = (int)x;
//		hitbox.y = (int)y;
//	}
	 
	 public Rectangle2D.Float getHitbox() {
		return hitbox;
	}
	 
	 
	 
	 
}

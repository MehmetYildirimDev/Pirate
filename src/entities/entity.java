package entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class entity {

	protected float x,y;
	protected int width,height;
	protected Rectangle hitbox;//diktortgen
	
	public entity(float x, float y, int widht, int height){
		this.x = x;
		this.y = y;
		this.width = widht;
		this.height = height;
		initHitbox();
		
	}

	protected void drawHitbox(Graphics g) {
		g.setColor(Color.PINK);
		g.drawRect(hitbox.x, hitbox.y, hitbox.width,hitbox.height);
	}
	
	 private void initHitbox() {
		hitbox = new Rectangle((int)x,(int)y,width,height);
	}
	 
	 protected void updateHitbox() {//konumu surekli guncelliyoruz
		hitbox.x = (int)x;
		hitbox.y = (int)y;
	}
	 
	 public Rectangle getHitbox() {
		return hitbox;
	}
	 
	 
	 
	 
}

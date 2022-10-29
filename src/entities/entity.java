package entities;

public abstract class entity {

	protected float x,y;
	protected int width,height;
	public entity(float x, float y, int widht, int height){
		this.x = x;
		this.y = y;
		this.width = widht;
		this.height = height;
	}
}

package game.entity.item;

import engine.Entity;
import engine.Sprite;

public class Item extends Entity {
	protected String name;
	
	public void pickUp() {
		
	}
	
	protected void init(float x, float y, float r, float g, float b, float width, float height, String name) {
		this.x = x;
		this.y = y;
		this.type = 1;
		this.name = name;
		this.sprite = new Sprite(r, g, b, width, height);
	}
}

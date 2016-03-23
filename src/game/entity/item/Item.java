package game.entity.item;

import engine.Entity;
import engine.Physics;
import engine.Sprite;
import game.entity.Player;

public class Item extends Entity {
	protected String name;
	protected Player player;
	
	public Item(Player player) {
		this.player = player;
	}
	
	public void pickUp() {
		System.out.println("You just picked up " + name + "!");
		player.addItem(this);
		remove();
	}
	
	protected void init(float x, float y, float r, float g, float b, float width, float height, String name) {
		this.x = x;
		this.y = y;
		this.type = 1;
		this.name = name;
		this.sprite = new Sprite(r, g, b, width, height);
	}
	
	public void update() {
		if (Physics.checkCollisions(this, player))
			pickUp();
	}
	
	public String getName() {
		return name;
	}
}

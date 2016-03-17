package game.entity.item;

import engine.Physics;
import game.entity.Player;

public class Cube extends Item {
	public static final float SIZE = 32;
	private Player player;
	
	public Cube(float x, float y, Player player) {
		this.player = player;
		init(x, y, 1.0f, 0.5f, 0, SIZE, SIZE, "The Cube");
	}
	
	public void pickUp() {
		System.out.println("You just picked up " + name + "!");
		player.addItem(this);
		remove = true;
	}
	
	public void update() {
		if (Physics.checkCollisions(this, player))
			pickUp();
	}
}

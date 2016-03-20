package game.entity;

import org.lwjgl.input.Keyboard;

import engine.Entity;
import game.entity.item.Item;

public class Player extends Entity{
	public static final float SIZE = 32;
	
	private Stats stats;
	
	public Player(float x, float y) {
		init(x, y, 0.1f, 1f, 0.25f, SIZE, SIZE, 0);
		stats = new Stats(0);
	}
	
	@Override
	public void update() {
//		System.out.println("Level: " + getLevel());
	}
	
	public void getInput() {
		if (Keyboard.isKeyDown(Keyboard.KEY_W))
			move(0,1);
		if (Keyboard.isKeyDown(Keyboard.KEY_S))
			move(0,-1);
		if (Keyboard.isKeyDown(Keyboard.KEY_A))
			move(-1,0);
		if (Keyboard.isKeyDown(Keyboard.KEY_D))
			move(1,0);
	}
	
	private void move(float magX, float magY) {
		x += getSpeed() * magX;
		y += getSpeed() * magY;
	}
	
	public float getSpeed() {
		return stats.getSpeed();
	}
	
	private int getLevel() {
		return stats.getLevel();
	}
	
	public int getMaxHealth() {
		return stats.getMaxHealth();
	}
	
	public int getCurrentHealth() {
		return stats.getCurrentHealth();
	}
	
	public float getStrength() {
		return stats.getStrength();
	}
	
	public float getMagic() {
		return stats.getMagic();
	}
	
	public void addXP(float amount) {
		stats.addXP(amount);
	}
	
	public void addItem(Item item) {
		System.out.println("We just picked up an item");
	}
}

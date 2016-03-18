package game;

import java.util.ArrayList;

import org.lwjgl.opengl.Display;

import engine.Entity;
import game.entity.Player;
import game.entity.item.Cube;

public class Game {
	private ArrayList<Entity> entitys;
	private ArrayList<Entity> remove;
	private Player player;
	
	public Game() {
		entitys = new ArrayList<Entity>();
		remove = new ArrayList<Entity>();
		
		player = new Player(Display.getWidth() /2 - Player.SIZE / 2, Display.getHeight() / 2 - Player.SIZE / 2);
		
		entitys.add(player);
		entitys.add(new Cube(32, 32, player));
	}
	
	public void getInput() {
		player.getInput();
	}
	
	public void update() {
		for (Entity e : entitys)
			if (!e.getRemove())
				e.update();
			else 
				remove.add(e);
		
		for (Entity e : remove)
			entitys.remove(e);
	}
	
	public void render() {
		for (Entity e : entitys)
			e.render();
	}
}

package engine;

import static org.lwjgl.opengl.GL11.glPopMatrix;
import static org.lwjgl.opengl.GL11.glPushMatrix;
import static org.lwjgl.opengl.GL11.glTranslatef;

public abstract class Entity {
	protected float x, y;
	protected int type;
	protected Sprite sprite;

	protected boolean[] flags = new boolean[1];
	
	public void update() {
		
	}
	
	public void render() {
		glPushMatrix();
		glTranslatef(x, y, 0);
		sprite.render();
		glPopMatrix();
	}
	
	protected void init(float x, float y, float r, float g, float b, float width, float height, int type) {
		this.x = x;
		this.y = y;
		this.type = type;
		this.sprite = new Sprite(r, g, b, width, height);
	}
	
	public int getType() {
		return type;
	}
	
	public boolean getRemove() {
		return flags[0];
	}
	
	public void remove() {
		flags[0] = true;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}
	
	public float getWidth() {
		return sprite.getWidth();
	}
	
	public float getHeight() {
		return sprite.getHeight();
	}
}

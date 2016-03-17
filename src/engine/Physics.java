package engine;

import java.awt.Rectangle;

public class Physics {
	public static boolean checkCollisions(Entity e1, Entity e2) {
		Rectangle r1 = new Rectangle((int) e1.getX(), (int) e1.getWidth(), (int) e1.getY(), (int) e1.getHeight());
		Rectangle r2 = new Rectangle((int) e2.getX(), (int) e2.getWidth(), (int) e2.getY(), (int) e2.getHeight());
		
		return r1.intersects(r2);
	}
}

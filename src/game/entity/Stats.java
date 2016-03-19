package game.entity;

public class Stats {
	public static final double LEVEL_CONST = 25 * Math.pow(3, 3.0 / 2.0);
	
	private float xp;
	
	public Stats(float xp) {
		this.xp = xp;
	}
	
	public float getSpeed() {
		return 4f;
	}
	
	private int getLevel() {
		double x = xp + 105;
		
		double a = Math.sqrt(243 * x * x + 4050 * x + 17500);
		double c = (3 * x + 25) / 25;
		double d = Math.cbrt(a / LEVEL_CONST + c);
		
		return (int) (d - 1.0 / d * 3) - 1;
	}
	
	public int getMaxHealth() {
		return getLevel() * 10;
	}
	
	public float getStrength() {
		return getLevel() * 4;
	}
	
	public float getMagic() {
		return getLevel() * 4f;
	}
	
	public void addXP(float amount) {
		xp += amount;
	}
}

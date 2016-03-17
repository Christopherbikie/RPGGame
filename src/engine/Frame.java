package engine;

public class Frame {
	private int length, numDisplayed;
	private Sprite sprite;
	
	public Frame(Sprite sprite, int length) {
		this.sprite = sprite;
		this.length = length;
		this.numDisplayed = 0;
	}
	
	public boolean render() {
		sprite.render();
		numDisplayed++;
		
		if (numDisplayed >= length) {
			numDisplayed = 0;
			return true;
		}
		
		return false;
	}
}

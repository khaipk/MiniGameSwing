package game1;

public class Health extends Items {
	private boolean visible = true;
	public Health(int x, int y, int height, int width) {
		super(x, y, height, width);
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
}

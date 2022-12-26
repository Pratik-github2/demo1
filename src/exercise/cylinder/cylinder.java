package exercise.cylinder;

public class cylinder {
	
	private int radius;
	
	private int height;
	
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double sa() {
		return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
		
	}
	
	public double volume() {
		return Math.PI*radius*radius*height;
		
	}
	
}

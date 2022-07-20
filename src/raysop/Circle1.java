package raysop;

public class Circle1 extends Shape {
	
	
	private static final double PI = 3.14;
	private int radius;
	private Double area;

	public void setRadius(int radius) {
		this.radius = radius;

	}

	public int getRadius() {
		return radius;
	}

	public double area() {
		area = PI * radius * radius;
		return area;
	}

}

package overriding;

public class Circle extends Shape {

	private static final double PI = 3.14;
	private int radius;

	public void setRadius(int radius) {
		this.radius = radius;

	}

	public int getRadius() {
		return radius;
	}

	public double area() {
		System.out.println("Circle");
		return super.area();
}
}
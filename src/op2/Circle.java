package op2;

public class Circle extends Shape {
	private int radius;
	private static final double PI = 3.14;
     private double area;
     
	public Circle(int radius) {
		this.radius = radius;
	}

	public int getradius() {
		return radius;

	}

	public double area() {
		 return area= PI * radius * radius;
	}

}

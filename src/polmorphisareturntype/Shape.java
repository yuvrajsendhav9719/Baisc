package polmorphisareturntype;

public class Shape {

	private String color;

	private int borderWidth;
	private double area;

	Shape() {
	}

	Shape(String color, int borderWidth, double area) {
		this.color = color;
		this.borderWidth = borderWidth;

	}

	public String getColor() {
		return color;

	}

	public int getBorderWidth() {
		return borderWidth;

	}

	public double area() {
		return area;
	}public static Shape getShape (int i) {
	if (i==1) {
		return new Rectangle ();
		
	}if (i==2) {
		return new Circle ();
		
	}if (i==3) {
		return new Tringle ();
		
		
	}return null;
	
}
}

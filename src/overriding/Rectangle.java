package overriding;

public class Rectangle extends Shape {
	
	private double area;
	 private int length;
	 private int width;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double area() {
		System.out.println("Rectangle");
		return area=length*width;
	}

}

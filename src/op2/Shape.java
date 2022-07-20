package op2;

public class Shape {

	
	private String color;

	private int borderWidth;
      private double area;
Shape(){}
Shape (String color, int borderWidth ,double area) {
	this.color=color;
	this.borderWidth=borderWidth;
	
}public String getColor () {
	return color;
	
}public int getBorderWidth() {
	return borderWidth;
	
}public double area() {
	return area;
}
}


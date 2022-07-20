package polmorphisareturntype;

public class Tringle extends Shape {
	 private int base;
	 private int height;
	 private double area;

	 public Tringle(){
		this.base=base;
		this.height=height;
		
	}public int getBase() {
		return base;
		
	}public int getHeight() {
		return height;
		
	}public double area() {
		return area=(base*height) /2;
	}
}

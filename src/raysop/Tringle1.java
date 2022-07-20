package raysop;
public class Tringle1 extends Shape {
	
	private int Base;

	private double area;

	public int getBase() {
		return Base;
	}

	public void setBase(int base) {
		Base = base;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	private int Height;

	public double area() {
		return (Base * Height) / 2;
	}


}
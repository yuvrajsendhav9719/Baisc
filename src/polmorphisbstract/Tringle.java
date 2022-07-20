package polmorphisbstract;

public class Tringle extends Shape{
	private double area;
	private int Base;
	private int Height;

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

	

	public double area() {
		return (Base * Height) / 2;
	}
}

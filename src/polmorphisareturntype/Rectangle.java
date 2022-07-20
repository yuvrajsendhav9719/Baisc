package polmorphisareturntype;

public class Rectangle extends Shape{

	private int length;
	private int width;


	 public Rectangle (){
		this.length=length;
		this.width=width;
		
	}public int getLength() {
		return length;
		
	}public int getWidth() {
		return width;
		
	}public double area() {
		return length*width;
	}
}

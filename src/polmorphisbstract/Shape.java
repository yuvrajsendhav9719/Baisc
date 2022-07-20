package polmorphisbstract;

public  abstract class Shape {
	private String color;
	private int borderWidth;
	
	
	public double area;
	
	 public   void setColor(String color) {
		 this.color=color;
		 
	 }public String getColor() {
		 return color;
		 
	 }public void setBorderWidth(int borderWidth) {
		 this.borderWidth=borderWidth;
		 
	 }public int getBorderWidth() {
		 return borderWidth;
		 
	 }
	 public abstract double area();
		 
	 
}

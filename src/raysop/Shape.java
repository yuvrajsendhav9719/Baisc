package raysop;

public class Shape {
	private String color;
	private int borderWidth;
	
	
	private double area;
	 public   void setColor(String color) {
		 this.color=color;
		 
	 }public String getColor() {
		 return color;
		 
	 }public void setBorderWidth(int borderWidth) {
		 this.borderWidth=borderWidth;
		 
	 }public int getBorderWidth() {
		 return borderWidth;
		 
	 }
	 public void setArea(double area) {
		 this.area=area;
		 
	 }
	 public double getArea() {
		 return area;
	 }

}

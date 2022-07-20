package raysop;
 
public class TestShape {
public static void main(String[] args) {
	Shape i=new Shape();
	
	
	
	Circle1 c=new Circle1();
	
	c.setRadius(5);
	System.out.println("Radius "+ c.getRadius());
	System.out.println(" Area of Radius" + c.area());
	
	Rectangle r=new Rectangle();

	r.setLength(4);
	System.out.println("Length"  +  r.getLength());
	r.setWidth(6);
	System.out.println("width"+ " "+ r.getWidth() );
	System.out.println("Area of rectangle"+ " "+r.area());
	Tringle1 t=new Tringle1();
	t.setBase(2);
	System.out.println("base" +" "+t.getBase() );
	
	t.setHeight(8);
	System.out.println(" Height"+" "+t.getHeight());
	
	System.out.println("Area of tringle"+ " "+t.area());
	 
	  
}
}
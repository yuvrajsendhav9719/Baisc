package polmorphisbstract;

public class TestShape {
	public static void main(String[] args) {
		 
		Shape s= new Rectangle();
		s.setBorderWidth(5);
		s.setColor("red");
		
		Rectangle r= (Rectangle)s;
		r.setLength(5);
		r.setWidth(2);
		System.out.println(r.area());
		
		Circle c= new Circle();
		c.setRadius(5);
		System.out.println(c.area());
		
			Tringle t= new Tringle();
			t.setBase(2);
		    t.setHeight(10);
			System.out.println(t.area());
		
	}

}

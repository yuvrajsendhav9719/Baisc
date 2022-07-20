package polmorphisarry;

public class TestShape {
public static void main(String[] args) {
	Shape[] s=new Shape[3];
	
	
	s[0]=new Rectangle();
	s[1]=new Circle();
	s[2]=new Tringle();
	 
	
	Rectangle r= (Rectangle) s[0];
	r.setLength(5);
	r.setWidth(10);
	
	Circle c=(Circle) s[1];
	c.setRadius(6);
	
	Tringle t= (Tringle) s[2];
	t.setBase(5);
	t.setHeight(10);
	
	double totalarea =0;
	
	for (int i = 0; i < s.length; i++) {
		totalarea +=s[i].area();
	}System.out.println("Total Area="+totalarea);
}
}

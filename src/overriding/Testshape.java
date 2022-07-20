package overriding;

public class Testshape {
public static void main(String[] args) {
	Shape s=new Shape();
	s.area();
	Shape s1=new Circle ();
	s1.area();
	Shape s2=new Rectangle ();
	
	s2.area();
	System.out.println();
	Shape s3 =new Tringle();
	s3.area();
	Circle c=new Circle ();
	c.area();
	Tringle t=new Tringle ();
	t.area();
	Rectangle r=new Rectangle ();
	r.area();
	
	Shape s5= new Rectangle();
	Rectangle r2=(Rectangle)s5;
	
r2.area(); 
s5.area();

}
}

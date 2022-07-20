package raysop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testperson {
public static void main(String[] args) throws ParseException {
	Person122 h=new Person122 ();
	String s="22/03/2203";




	SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
		


	Date d =sdf.parse(s);
	h.setName("yuvraj");
	h.setAddress("indore");
	h.setDob(d);
	System.out.println(h.getName() );
	System.out.println(h.getAddress());
System.out.println( h.getDob());





}
}

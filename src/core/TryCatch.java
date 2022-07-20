package core;

public class TryCatch {
public static void main(String[] args) {
	
	int a=10;
	int b=0;
	
	
	 try { int c=a/b;
	 System.out.println(c);
		
	} catch (Exception e) {
		System.err.println(" not divide by zeeo" );
		e.printStackTrace();
		System.out.println(e.getMessage());
		
	}
}

}

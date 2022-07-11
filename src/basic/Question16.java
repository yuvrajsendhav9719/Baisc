package basic;

public class Question16 {
public static void main(String[] args) {
q();
}
public static void  q() {
	

	int a[]= {12,34,4,67,89};
	
	int t=0;
	int s=0;
	for (int i= 0; i<a.length; i++) {
		if(t<a[i]) {
			s=t;
			t=a[i];
		}
	}System.out.println("second element" + s);
	
}
}

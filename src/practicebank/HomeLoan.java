package practicebank;

public class HomeLoan {

	public static void main(String[] args) {
		 
		Bank[] b= new Bank[3];
		
		b[0]=new AxixBank();
		b[1]=new HDFCBank();
		b[2]=new ICICIBank();
		
		loanEnquiry(b);
		
		
		
	}

	private static void loanEnquiry(Bank[] b) {
		for (Bank a :b) {
			String name=a.getName();
			double rate=a.interestRate();
			System.out.println(name  + " = " + rate)  ;
				
			
		}
		
	}
}

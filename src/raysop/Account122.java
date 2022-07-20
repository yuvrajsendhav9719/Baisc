package raysop;


public class Account122 {
	
private String number;

private String accountType ;
private double balance;
private double deposit;
public void setNumber (String number) {
	this.number=number;
	
	
}public String getNumber () {
	return number;
	
}public void setAccountType(String accounttype) {
	this.accountType=accounttype;
	
}
public String getAccountType () {
	return accountType; 

}
 public void setBalance(double balance) {
	 this.balance=balance;
 }
 public double getBalance() {
	 return balance ;

 }
 public void deposit (double bal ) {
	 double current=bal+getBalance();
	 setBalance(current);
	 
	 
 }
 public void withdrawal(double with) {
	 double withdrawal=getBalance()-with;
	 setBalance(withdrawal);
	 
	 
 }
 public void fundTrasfer(double f1) {
	 double fund=getBalance()-f1;
	 setBalance(fund);
 
 
 
 
 }
}

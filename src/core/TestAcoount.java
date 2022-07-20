package core;

import raysop.Account122;

public class TestAcoount {
	public static void main(String[] args) {
		
	
	
	
	Account i=new Account();
	i.setNumber(89240003736.00);
	System.out.println("account no. "+i.getNumber());
	i.setAccountType("saving");
	System.out.println("accountType"+i.getAccountType());

	i.setBalance(2000);
System.out.println("present balance "+i.getBalance());
	i.deposit(20000);
System.out.println("balance after deposite "+i.getBalance());

	i.withdrawal(22000);

System.out.println("balance after withdrawl "+i.getBalance());
	//i.fundTrasfer(4000);


System.out.println("accouctNumber"+i.getNumber());



System.out.println("fund "+i.getBalance());


	}

}

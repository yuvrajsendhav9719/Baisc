package core;

public class Account {

	private String Name;
	private String AccountType;
	private double Number;
	private double Balance;

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public double getNumber() {
		return Number;
	}

	public void setNumber(double number) {
		Number = number;

	}

	public void deposit(double bal) {
		double currentBalance = bal + getBalance();
		setBalance(currentBalance);

	}

	public void withdrawal(double with) {
		double currentBalance = getBalance() - with;

		if (currentBalance < 2000) {

			try {
				throw new Exception1();

			} catch (Exception1 e) {
				System.out.println(e);
				e.printStackTrace();
			}
		}

	}

}

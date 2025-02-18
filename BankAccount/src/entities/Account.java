package entities;

public class Account {

	private int number;
	private String name;
	private double money;
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public Account(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}
	
	public void deposit (double amount) {
		money += amount;
	}
	
	public void withdraw (double amount) {
		money -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", money);
	}
	
	
}

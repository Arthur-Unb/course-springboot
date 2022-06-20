package entities;

public class Banco {

	private int account;
	private String name;
	private double value;

	public Banco(int account, String name) {
		this.account = account;
		this.name = name;
	}

	public Banco(int account, String name, double initialDeposit) {
		this.account = account;
		this.name = name;
		deposit(initialDeposit);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccount() {
		return account;
	}

	public double getValue() {
		return value;
	}

	public void deposit(double amount) {
		value += amount;
	}

	public void withdraw(double amount) {
		value -= (amount + 5.00);
	}

	public String toString() {
		return "Account " + account + ", Holder: " + name + ", Balance: $ " + value;
	}

}

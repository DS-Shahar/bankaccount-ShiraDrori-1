package Bank;

public class BankAccount {
	private int balance = 0;
	private int minBalance = -5000;

	/**
	 * @param balance Amount of money in the account, can be negative
	 * @param balance Must be >= minBalance
	 */

	public BankAccount(int balance, int minBalance) {
		this.balance = balance;
		this.minBalance = minBalance;
	}



	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if (balance > minBalance) {
			this.balance = balance;
		}
	}
	public int getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}   

	public boolean withdraw(int amount) { 
		if (balance - amount < minBalance)
			return false;
		balance = balance - amount;
		return true;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public boolean transfer (BankAccount bankTarget, int amount) {
		if (withdraw(amount)) {
			bankTarget.deposit(amount);
			return true;
		}
		else {
			return false;
		}

	}

	public String toString() {
		return "balance: " + balance;
	}

}


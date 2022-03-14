//13
public class Account {
	private double Balance;
	public Account(double initialBalance) {
		if(initialBalance >0.0)
			Balance=initialBalance;
	}
	public void credit(double amount) {
		Balance=Balance+amount;
	}
	public void debit(double amount) {
		Balance=Balance-amount;
	}
	public double getBalance() {
		return Balance;
	}

}

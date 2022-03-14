
public class SavingsAccount {
	public static double annualIntrestRate;
	public double savingsBalance;
	public SavingsAccount() {
		annualIntrestRate=0.0;
		savingsBalance=0.0;
	}
	public SavingsAccount(double rate,double savBal) {
		annualIntrestRate=rate;
		savingsBalance=savBal;
	}
	public double calculateMonthlyInterest() {
		double rate=(savingsBalance*annualIntrestRate)/12;
		savingsBalance+=rate;
		return rate;
	}
	public static void modifyIntrestrate(double newRate) {
		annualIntrestRate=newRate;
	}
	public void setSavingsBalance(double newBalance) {
		savingsBalance=newBalance;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public double getAnnualIntrestRate() {
		return annualIntrestRate;
	}

}

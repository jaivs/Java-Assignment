import java.util.Scanner;
public class TestSavingsAccount {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		SavingsAccount saver1=new SavingsAccount();
		SavingsAccount saver2=new SavingsAccount();
		saver1.setSavingsBalance(2000.00);
		saver2.setSavingsBalance(3000.00);
		SavingsAccount.modifyIntrestrate(0.04);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("new balance of saver1 ="+saver1.getSavingsBalance());
		System.out.println("new balance of saver2 ="+saver2.getSavingsBalance());
		SavingsAccount.modifyIntrestrate(0.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("new balance of saver1 = "+saver1.getSavingsBalance());
		System.out.println("new balance of saver2 = "+saver2.getSavingsBalance());
	}

}

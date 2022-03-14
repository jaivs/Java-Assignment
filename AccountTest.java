import java.util.Scanner;
public class AccountTest {
	public static void main (String args[]) {
		Account account1=new Account (50.00);
		//Account account2=new Account (-7.53);
		System.out.printf("Account1 Balance: $ %2f\n", account1.getBalance());
		//System.out.printf("Account2 Balance: $ %2f\n", account2.getBalance());
		Scanner input = new
				Scanner(System.in);
		double depoistAmount;
		double debitAmount;
		System.out.print("Enter deposit amount for account1:");
		depoistAmount = input.nextDouble();
		System.out.printf("\nadding %2f to account1 balance\n\n",depoistAmount);
		account1.credit(depoistAmount);
		System.out.printf("Account1 balance: $ %2f\n",account1.getBalance());
		//System.out.printf("Account2 balance: $ %2f\n\n",account2.getBalance());
		System.out.printf("Enter debit amount for account for account1: ");
		debitAmount=input.nextDouble();
		//System.out.printf("Enter debit amount for account1: ");
		//debitAmount=input.nextDouble();
		System.out.printf("\nSubtracting %2f from account1 balance\n\n",debitAmount);
		if
		(account1.getBalance()>=debitAmount)
		{
			account1.debit(debitAmount);
			System.out.printf("Account1 balance: $ %2f\n\n",account1.getBalance());
		}
		else {
			System.out.printf("!!! Debit amount exceeded account balance!!!\n\n");
		}
		/*System.out.printf("Enter debit amount for account2: ");
		debitAmount= input.nextDouble();
		System.out.printf("\nSubtracting %.2f from account2 balance\n\n",debitAmount);
		if
		(account1.getBalance()>=debitAmount)
		{
			account1.debit(debitAmount);
			System.out.printf("Account1 balance:$%2f\n",account1.getBalance());
			//System.out.printf("Account2 balance:$%2f\n",account2.getBalance());
			
		}
		else {
			System.out.printf("!!!Debit amount exceeded account balance!!!\n\n");
		}*/
		
		
	}
	
	

}

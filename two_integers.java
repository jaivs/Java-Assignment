//8
import java.util.Scanner;
public class two_integers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x%y==0)
		{
			System.out.println(x+" is a multile of "+y);
		}
		else
		{
			System.out.println(x+" is not a multile of "+y);
		}
	}

}

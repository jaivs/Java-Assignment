//5
import java.util.Scanner;

public class SumProduct {
	public static void main(String args[]) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any two numbers :");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Sum is :" +(a+b));
		System.out.println("Difference is :" +(a-b));
		System.out.println("Product is :"+(a*b));
		System.out.println("Division is :"+(a/b));
	}

}

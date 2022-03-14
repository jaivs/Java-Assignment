//2
import java.util.Scanner;
public class Product_of_three_integers {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int mul=0;
		System.out.println("Enter the three integers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		mul = a*b*c;
		System.out.println("The product of three integers are" + mul);
	}

}

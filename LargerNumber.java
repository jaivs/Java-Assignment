//6
import java.util.Scanner;
public class LargerNumber {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any two numbers:");
		int x=s.nextInt();
		int y=s.nextInt();
		if(x>y) {
			System.out.println(x+" is larger");
			
		}
		else if (y>x) {
			System.out.println(y+" is larger");
		}
		else {
			System.out.println("These numbers are equal");
		}
	}

}

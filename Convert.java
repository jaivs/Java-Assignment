//3
import java.util.Scanner;
public class Convert {
	public static void main(String args[]) {
		float fahrenheit , celsius;
		System.out.println("Enter the Degrees of Fahrenheit");
		Scanner sc=new Scanner(System.in);
		fahrenheit = sc.nextFloat();
		celsius=((fahrenheit-32)*5)/9;
		System.out.println("Temperature in Celsius is: "+celsius);
	}
	

}

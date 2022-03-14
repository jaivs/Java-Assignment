//7
import java.util.Scanner;
public class three_integers 
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any three numbers:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		if(x>y&&x>z)
		{
			System.out.println("Largest number is "+x);
		}
		else if(y>x&&y>z)
		{
			System.out.println("Largest number is "+y);
		}
		else if(z>x&&z>y)
		{
			System.out.println("Largest number is "+z);
		}
		if(x<y&&x<z)
		{
			System.out.println("Smallest number is "+x);
		}
		else if(y<x&&y<z)
		{
			System.out.println("Smallest number is "+y);
		}
		else if(z<x&&z<y)
		{
			System.out.println("Smallest number is "+z);
		}
		System.out.println("Sum is :"+(x+y+z));
		System.out.println("Average is :"+((x+y+z)/3));
	}

}

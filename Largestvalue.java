//9
import java.util.*;
public class Largestvalue {
	public static void main(String[] args)
	{
		int i,n,j,max=0;
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the size of the array:");
		//n=sc.nextInt();
		int a[]=new int[10];
		System.out.println("enter the array elements");
		for(i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
			
		}
		max=a[0];
		for(i=0;i<10;i++)
		{
		if(a[i]>max)
		{
			max=a[i];
		}
		}
		System.out.println("Largest value in array is "+max);
	}

}

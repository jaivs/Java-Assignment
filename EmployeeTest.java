//15
import java.util.Scanner;
public class EmployeeTest {
	public static void main(String args[] ) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		Scanner sc=new Scanner(System.in);
		String first;
		String last;
		double salary;
		System.out.println("Enter First Name of First Employee: ");
		first=sc.next();
		e1.setfirstName(first);
		System.out.println("Enter Last Name of First Employee:");
		last=sc.next();
		e1.setlastName(last);
		System.out.println("Enter Monthly Salary of First Employee: ");
		salary=sc.nextDouble();
		e1.setSalary(salary);
		System.out.println("Enter First Name of Second Employee");
		first=sc.next();
		e2.setfirstName(first);
		System.out.println("Enter Last Name of Second Employee");
		last=sc.next();
		e2.setlastName(last);
		System.out.println("Enter Monthly Salary of Second Employee:");
		salary=sc.nextDouble();
		e2.setSalary(salary);
		System.out.println("First Employee's Full Name and yearly Salary.\n");
		System.out.println(e1.getfirstname() + " " +e1.getlastname()+" "+ e1.getSalary()*12+"\n");
		System.out.println("Second Employee's Full Name and Yearly Salary\n");
		System.out.println(e2.getfirstname() + " " +e2.getlastname() + " " + e2.getSalary() * 12 + "\n");
		System.out.println("Displaying New Total Annual Salary After 10% Raise.\n");
		System.out.println(e1.getfirstname()+ " " +e1.getlastname() + " " + (e1.getSalary()*1.10*12 + "\n"));
		System.out.println(e2.getfirstname()+ " " +e2.getlastname() + " " + (e2.getSalary()*1.10*12 + "\n"));
	}

}

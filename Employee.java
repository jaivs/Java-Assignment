
public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;
	public Employee() {
		firstName=null;
		lastName=null;
		monthlySalary=0.0;
	}
	public String getfirstname() {
		return firstName;
	}
	public String getlastname() {
		return lastName;
	}
	public double getSalary() {
		return monthlySalary;
	}
	public void setfirstName(String first) {
		firstName= first;
	}
	public void setlastName(String last) {
		lastName=last;
	}
	public void setSalary(double salary) {
		monthlySalary=salary;
	}

}

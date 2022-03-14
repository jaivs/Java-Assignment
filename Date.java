//16
import java.util.Scanner;
public class Date {
	int Month,Day,Year;
	public Date(int Mon, int MyDay, int MyYear) {
		Month=Mon;
		Day=MyDay;
		Year=MyYear;
	}
	public void setMonth(int Mon) {
		Month=Mon;
	}
	public int getMonth(int Mon) {
		return Month;
	}
	public void setDay(int MyDay) {
		Day=MyDay;
	}
	public int getDay(int MyDay) {
		return Day;
	}
	public void setYear (int MyYear) {
		Year=MyYear;
	}
	public int getYear(int MyYear) {
		return Year;
	}
	public void DisplayDate() {
		System.out.println("Date : "+Month+"/"+Day+"/"+Year);
	}

}

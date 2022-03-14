import java.util.*;
public class MyOwnAutoShop {
	public static void main(String[] args)
	{
		Car car=new Car(120,500000,"Silver");
		Sedan sedan=new Sedan(180,250000,"White",25);
        Ford  ford=new Ford(180,550000,"blue",1977,45);
		Ford ford2=new Ford(200,450000,"Sea Green",1988,10);
		System.out.println("Sales Price of Car: "+car.getSalesPrice());
		System.out.println("Sales Price of Sedan: "+sedan.getSalesPrice());
		System.out.println("Sales Price of Ford: "+ford2.getSalesPrice());
	}
	

}

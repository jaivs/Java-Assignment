//19
public class Car {
	int speed;
	double regularPrice;
	String color;
	public Car(int speed,double regularPrice,String color) {
		this.speed=speed;
		this.regularPrice=regularPrice;
		this.color=color;
	}
	public double getSalesPrice() {
		return regularPrice;
	}
}
class Truck extends Car{
		int weight;
		public Truck(int speed,double regularPrice, String color,int weight) {
			super(speed,regularPrice,color);
			this.weight=weight;
			
			
			
		}
		public double getSalePrice() {
			return 
					super.getSalesPrice()*(weight>2000 ? 0.10 : 0.20);
		}
}
class Ford extends Car {
		int year;
		int manufacturerDiscount;
		public Ford(int speed,double regularPrice,String color,int year,int manufacturerDiscount) {
			super(speed,regularPrice,color);
			this.year=year;
			this.manufacturerDiscount=manufacturerDiscount;
		}
		public double getSalesPrice() {
			return super.getSalesPrice()-manufacturerDiscount;
		}
	}
class Sedan extends Car{
		int length;
		public Sedan(int speed,double regularPrice,String color,int length) {
			super(speed,regularPrice,color);
			this.length=length;
		}
		public double getSalesPrice() {
			return 
					super.getSalesPrice()*(length>20 ? 0.05:0.10);
		}
	}



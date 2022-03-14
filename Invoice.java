//14
public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;
	public Invoice(String pNum, String pDesc ,int qty , double prc) {
		if (pNum !=null) partNumber=pNum;
		else partNumber="0";
		if (pDesc !=null)
			partDescription=pDesc; else
				partDescription="0";
		if(qty > 0) quantity=qty; else
			quantity=0;
		if(prc > 0.0) price=prc; else price=0;
		
	}
	public String getPartNum() {
		return partNumber;
	}
	public String getPartDesc() {
		return partDescription;
}
	public int getQuantity()
	{
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPartNum(String pNum) {
		if (pNum != null) {partNumber=pNum;}
		else {partNumber="0";}
	}
	public void serQuantity(int qty) {
		if (qty > 0) {quantity=qty;}
		else {quantity=0;}
	}
	public void setprice(double prc) {
		if (prc > 0.0) {price=prc;}
		else {price=0.0;}
	}
	public double getInvoiceAmount() {
		return (double)quantity*price;
	}
		
	}


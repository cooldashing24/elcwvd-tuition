// WAP to calculate bill with 10% discount

class BillDemo
{
	public static void main(String[] args)
	{
		double bill = 4500.8, discPer = 10;
		
		double discount = bill * (discPer / 100);
		
		System.out.println("Bill Amount: " + bill);
		System.out.println("Discount: " + discount);
		
		double netBill = bill - discount;
		System.out.println("Net Amount: " + netBill);
	}
	
}









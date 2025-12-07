// Bill Discount Demo

class BillDiscDemo
{
	public static void main(String[] args)
	{
		double bill = 3500, discPer = 10, netBill;
		double discount = bill * (discPer / 100);
		
		netBill = bill - discount;
		
		System.out.println("Bill Amount: " + bill);
		System.out.println("Discount: " + discount);
		System.out.println("Net Amount: " + netBill);
		
	}
}












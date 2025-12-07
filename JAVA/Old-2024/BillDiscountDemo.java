//WAP to calculate discount for bill amount

class BillDiscountDemo
{
	public static void main(String[] args)
	{
		double bill = 6705.55, discPer = 0.10, netBill, discount = 0;
		
		if (bill >= 5000)
		{
			discount = bill * discPer;
		}

		netBill = bill - discount;
		System.out.println("Bill Amount: " + bill);
		System.out.println("Discount: " + discount);
		System.out.println("Net Amount: " + netBill);
		
	}
}
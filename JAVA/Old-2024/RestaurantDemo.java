// WAP to calculate total bill, 2% tip & per head amount

class RestaurantDemo
{
	public static void main(String[] args)
	{
		double bill = 3880, tipPer = 2, netBill, tip;
		int nPerson = 4;
		tip = bill * (tipPer / 100);
		netBill = bill + tip;
		
		System.out.println("Bill Amount: " + bill);
		System.out.println("Total Tip: " + tip);
		System.out.println("Net Amount: " + netBill);
		System.out.println("#Person: " + nPerson);
		
		double amtPerHead = netBill / nPerson;
		System.out.println("Amount per Head: " + amtPerHead);
	}
	
}









class ResDemo
{
	public static void main(String[] args)
	{
		double amount = 10000, tipPer = 2;
		int nPerson = 17;
		
		double totalTip = amount * tipPer / 100;
		double totalBill = amount + totalTip;
		
		System.out.println("Bill Amount: " + amount);
		System.out.println("Tip Percentage: " + tipPer);
		System.out.println("Total Tip: " + totalTip);
		System.out.println("Total Bill: " + totalBill);
		System.out.println("Total Person: " + nPerson);
		
		double perHeadBill = totalBill / nPerson;
		System.out.println("Amount per Head: " + perHeadBill);
	}
}
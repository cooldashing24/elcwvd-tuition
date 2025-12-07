class RestaurantDemo1
{
	public static void main(String[] args)
	{
		int nPerson = 4;
		double bill = 3880, tipPer = 2;
		double tip = bill * (tipPer / 100);
		double totalBill = bill + tip;
		
		System.out.println("Bill Amount: " + bill);
		System.out.println("Total Person: " + nPerson);
		System.out.println(tipPer + "% tip: " + tip);
		System.out.println("Total Bill: " + totalBill);
		double perHead = totalBill /nPerson;
		System.out.println("Amount per Head: " + (perHead));
		
		
	}
}
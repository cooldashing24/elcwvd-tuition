class BillDemo1
{
	public static void main(String[] args)
	{
		double amount = 10000, tip = 5;
		int nPerson = 20;
		
		double totalTip = amount * tip / 100;
		double totalBill = amount + totalTip;
		double billPerHead = totalBill / nPerson;
		
		System.out.println("Bill amount: " + amount);
		System.out.println("Tip: " + tip + "%");
		System.out.println("Total Bill: " + totalBill);
		System.out.println("Total Person: " + nPerson);
		System.out.println("Amount Per Head: " + billPerHead);
		
	}
}
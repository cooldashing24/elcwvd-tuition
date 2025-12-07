// TaxBracketDemo
class TernaryOperatorDemo
{
	public static void main(String[] args)
	{
		double income = 80000, tax = 0, per = 0;
		System.out.println("Annual Income: " + income);
		
		if (income >= 100000)
		{
			per = 0.2;
		}
		else if (income >= 50000)
		{
			per = 0.15;
		}
		else if (income >= 20000)
		{
			per = 0.10;
		}
		else
		{
			per = 0.05;
		}
		
		tax = income * per;
		System.out.println("Payable Tax: " + tax);
	}
}
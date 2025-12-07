class FixedDeposit
{
	double principalAmount, interest;
	int timeYear;
	
	double getSI()
	{
		return (principalAmount * interest * timeYear) / 100;
	}
	
	void display()
	{
		System.out.println("=============");
		System.out.println("P.Amt: " + principalAmount);
		System.out.println("Int: " + interest);
		System.out.println("Period(Year/s): " + timeYear);
		System.out.println("Simple Interest: "+ getSI());
		System.out.println("Maturity: "+ (getSI() + principalAmount));
		

	}
}

class FixedDepositDemo
{
	public static void main(String[] args)
	{
		FixedDeposit f1 = new FixedDeposit();
		System.out.println(f1.principalAmount);
		f1.principalAmount = 15000;
		f1.interest = 12.5;
		f1.timeYear = 5;
		f1.display();
		
		FixedDeposit f2 = new FixedDeposit();
		System.out.println(f2);
		
		f2.principalAmount = 26000;
		f2.interest = 10;
		f2.timeYear = 3;
		f2.display();
		

	}
}







class FixedDeposit
{
	private double principalAmount, interest;
	int timeYear;
	static double totDeposit;
	
	// No - argument constructor
	FixedDeposit()
	{
		setDetails(1000, 0.05, 3);
	}
	
	FixedDeposit(double pa, double rOI, int time)
	{
		setDetails(pa, rOI, time);
	}
	
	void setDetails(double pa, double rOI, int time)
	{
		//principalAmount = pa;
		setPrincipalAmount(pa);
		interest = rOI;
		timeYear = time;
	}

	double getSI()
	{
		return (principalAmount * interest * timeYear) / 100;
	}
	
	void display()
	{
		System.out.println("=============");
		System.out.println("P.Amt: " + getPrincipalAmount());
		System.out.println("Int: " + interest);
		System.out.println("Period(Year/s): " + timeYear);
		System.out.println("Simple Interest: "+ getSI());
		System.out.println("Maturity: "+ (getSI() + principalAmount));
		System.out.println("Total Deposit: "+ totDeposit);
	}
	
	// getter or accessor method
	double getPrincipalAmount()
	{
		return principalAmount;
	}
	
	// setter or mutator method
	void setPrincipalAmount(double pa)
	{
		totDeposit = totDeposit + pa;
		principalAmount = pa;
	}
}

class FixedDepositDemo1
{
	public static void main(String[] args)
	{
		FixedDeposit f1 = new FixedDeposit();
		f1.display();
		System.out.println(f1.getPrincipalAmount());
		f1.setPrincipalAmount(15000);
		f1.display();
		f1.setDetails(25500, 12.5, 5);
		// uncommenting below lines will generate an error as interest & timeYear are declared private in class
		/*f1.interest = 12.5;
		f1.timeYear = 5;*/
		f1.display();
		
		FixedDeposit f2 = new FixedDeposit(74000, 10, 3);
		f2.display();
		System.out.println(f2);
		
		/*f2.principalAmount = 26000;
		f2.interest = 10;
		f2.timeYear = 3;*/
		f2.display();
	}
}







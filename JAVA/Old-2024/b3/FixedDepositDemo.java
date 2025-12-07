class FixedDeposit
{
	static double totDeposit;
	private double principalAmount, interest;
	int timeYear;

	// No - argument constructor
	FixedDeposit()
	{
		setDetails(1000, 0.05, 3);
	}

	// Parameterized constructor
	FixedDeposit(double pa, double rI, int period)
	{
		setDetails(pa, rI, period);
	}
	
	void setTotalDeposit(double pa)
	{
		totDeposit = totDeposit + pa;
	}
	
	void setDetails(double pa, double rI, int period)
	{
		setTotalDeposit(pa);
		setPrincipalAmount(pa);
		interest = rI;
		timeYear = period;
	}
	
	double getSI()
	{
		return (principalAmount * interest * timeYear) / 100;
	}
	
	//https://www.youtube.com/watch?v=3iTWF_22j_s	
	void display()
	{
		System.out.println("=============");
		System.out.println("Principal Amt: " + getPrincipalAmount());
		System.out.println("Int: " + interest);
		System.out.println("Period(Year/s): " + timeYear);
		System.out.println("Simple Interest: "+ getSI());
		System.out.println("Maturity: "+ (getSI() + principalAmount));
		System.out.println("Total Deposit: "+ totDeposit);
	}
	
	//getter
	double getPrincipalAmount()
	{
		return principalAmount;
	}
	
	//setter
	void setPrincipalAmount(double pa)
	{
		principalAmount = pa;
	}
	
}

class FixedDepositDemo
{
	public static void main(String[] args)
	{
		FixedDeposit f1 = new FixedDeposit();
		// Uncommenting below line will generate an error because principalAmount is declared as private
		//System.out.println("Principal Amt: " + f1.principalAmount);
		System.out.println("Principal Amt: " + f1.getPrincipalAmount());
		f1.display();
		f1.setDetails(15000, 12.5, 5);
		f1.display();
		
		FixedDeposit f2 = new FixedDeposit(80000, 8.6, 7);
		f2.display();
		f2.setDetails(26000, 10, 3);
		f2.display();
		

	}
}







class FixedDeposit
{
	double principalAmt, interest, sI;
	int timeYear;
	
	double getSI()
	{
		return (principalAmt * interest * timeYear) / 100;
	}
	
	double getMaturityAmt()
	{
		return getSI() + principalAmt;
	}
	
	void display()
	{
		System.out.println("=============");
		System.out.println("P.Amt: " + principalAmt);
		System.out.println("ROI: " + interest);
		System.out.println("Period(Year/s): " + timeYear);
		System.out.println("Simple Interest: " + getSI());
		System.out.println("Maturity Amount: " +getMaturityAmt());
	}
}

class FixedDepositDemo1
{
	public static void main(String[] args)
	{
		FixedDeposit f1 = new FixedDeposit();
		System.out.println(f1.principalAmt);
		
		f1.principalAmt = 16000;
		f1.interest = 7.2;
		f1.timeYear = 2;
		f1.display();
		
		FixedDeposit f2 = new FixedDeposit();
		
		f2.principalAmt = 35000;
		f2.interest = 6.2;
		f2.timeYear = 6;
		f2.display();
		
	}
}











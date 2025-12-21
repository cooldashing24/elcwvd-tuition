class FixedDeposit
{
	double principalAmt, interestRate, periodYears;
	
	FixedDeposit()
	{
		setDetails(1500, 6.5, 3.2);
		/*
		principalAmt = 1000;
		interestRate = 5;
		periodYears = 3;
		*/
	}
	
	FixedDeposit(double p, double interestRate, double t)
	{
		setDetails(p, interestRate, t);
	}
	
	void display()
	{
		System.out.println("---------------");
		System.out.println("Principal Amt: " + principalAmt);
		System.out.println("Rate of Interest: " + interestRate);
		System.out.println("Duration(Varas): " + this.periodYears);
		System.out.println("Simple Interest: " + this.getSI());
		System.out.println("Maturity Amt: " + getMaturityAmt());
	}
	
	void setDetails(double p, double interestRate, double t)
	//void setDetails(double p, double interest, double t)
	{
		principalAmt = p;
		this.interestRate = interestRate;
		periodYears= t;
	}
	
	double getMaturityAmt()
	{
		return principalAmt + getSI();
	}
	
	double getSI()
	{
		return (principalAmt * interestRate * periodYears) / 100;
	}
}

class FixedDepositDemoB2
{
	public static void main(String[] honeySuiNaiJati)
	{
		FixedDeposit f1 = new FixedDeposit();	// No argument cons
		f1.display();
		f1.setDetails(82000, 6.7, 4);
		f1.display();
		
		FixedDeposit f2 = new FixedDeposit(12880, 6.4, 2.5); // parameterized cons
		f2.display();
		f2.setDetails(255854, 7.1, 5);
		f2.display();
	}
}
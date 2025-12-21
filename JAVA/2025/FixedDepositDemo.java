class FixedDeposit
{
	private double principalAmt;		// private visibility
	double interestRate, periodYears;	// default visibility
	
	// accessor or getter
	double getPrincipalAmt()
	{
		return principalAmt;
	}
	
	void setPrincipalAmt(double pA)
	{
		principalAmt = pA;
	}

	// No-arguments constructor
	FixedDeposit()
	{
		setDetails(1000, 5, 3);
		/*
		principalAmt = 1000;
		interestRate = 5;
		periodYears = 3;
		*/
	}
	
	//parameterized constructor
	FixedDeposit(double p, double interestRate, double n)
	{
		setDetails(p, interestRate, n);
	}
	
	void display()
	{
		System.out.println("------------------");
		System.out.println("Principal Amt: "  + this.principalAmt);
		System.out.println("Rate of Interest: " + interestRate);
		System.out.println("Time(Years): " + periodYears);
		System.out.println("Maturity Interest: " + this.getSI());
		System.out.println("Maturity Amt: " + getMaturityAmt());
	}

	void setDetails(double p, double interestRate, double n)
	{
		principalAmt = p;
		//The name of the parameter is same as the property so we have to use this keyword with the property .
		this.interestRate = interestRate;
		periodYears = n;
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

class FixedDepositDemo
{
	public static void main(String[] args)
	{
		FixedDeposit f1 = new FixedDeposit();
		//f1.principalAmt = 5670;
		f1.setPrincipalAmt(5670);
		// As principalAmt is private in FixedDeposit class we can't use it outside the class
		// System.out.println("Muddal Rakkam: " + f1.principalAmt);
		 System.out.println("Muddal Rakkam: " + f1.getPrincipalAmt());
		
		f1.display();

		f1.setDetails(50000, 7.2, 4);
		f1.display();
		
		FixedDeposit f2 = new FixedDeposit(150000, 5.6, 4);
		f2.display();
		f2.setDetails(72000, 8.1, 7);
		f2.display();
	}
}
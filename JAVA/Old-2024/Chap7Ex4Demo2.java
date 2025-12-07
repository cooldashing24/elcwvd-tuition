class Chap7Ex4Demo2
{
	static void calculateEMI(double pA)
	{
		double annualInterest = 12;
		
		// 12% / 12
		// dividing by 12 as 1 year = 12 months
		double monthlyInterest = 0.01;
		// time or period or duration
		double n = 36;
		
		double x = Math.pow((1 + monthlyInterest), n);
		double emi = (pA * monthlyInterest * x) / (x - 1);
		System.out.println("Loan Amount: " + pA);
		//System.out.println("Interest: " + monthlyInterest);
		//System.out.println("Monthly Installment: " + emi);
		System.out.printf(" -> EMI: %.2f", emi);
		System.out.println();
	}
	
	public static void main(String[] args)
	{	
		for (int p = 10000; p <= 100000; p += 10000)
		{
			System.out.println("--------------------");
			calculateEMI(p);
		}
	}
}









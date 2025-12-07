class Chap7Ex4Demo22
{
	static void patel(double pA)
	{
		double annualInterest = 12;
		
		// 12% / 12
		// dividing by 12 as 1 year = 12 months
		double monthlyInterest = 0.01;
		// time or period or duration
		double n = 36;
		
		double x = Math.pow((1 + monthlyInterest), n);
		double emi = (pA * monthlyInterest * x) / (x - 1);
		//System.out.println("Loan: " + pA + " -> MI: " + emi);
		System.out.printf("Loan: %f -> MI: %.2f", pA, emi);
		System.out.println();
	}

	public static void main(String[] args)
	{
		//patel(25000);
		
		for(int p = 10000; p <= 100000; p+= 10000)
		{
			
			
			patel(p);
		}
		
	}
	
}










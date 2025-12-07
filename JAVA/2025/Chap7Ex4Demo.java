class Chap7Ex4Demo
{
    public static void main(String[] args) 
	{
		// pA -> Principle Amount
		double interestPer = 12, pA = 10000, n = 100000;
		double si, durationMonths = 42, emi = 0;
		
		while (pA <= n)
		{
			si = (pA * interestPer * durationMonths) / (100 * 12);
			emi = (pA + si) / durationMonths ;
			//System.out.println("EMI for " + pA + " is " + emi );
			System.out.printf("EMI for %.2f is %.2f\n", pA, emi );
			pA += 10000;
		}
		
		
		
	}
}
class CallCostDemo
{
	public static void main (String[] args)
	{
		double duration = 130; 	// duration in seconds
		double balance = 5804; 		// in paise
		double callRate = 2;		// call rate(paise/sec)
		
		double callCharges = duration * callRate;
		
		System.out.println("Balance(Paise):  " + balance);
		System.out.println("Call Rate(Paise/Sec):  " + callRate);
		System.out.println("Duration(Sec):  " + duration);

		System.out.println("Call Charges(Paise):  " + callCharges);
		balance = balance - callCharges;
		System.out.println("New Balance(Paise):  " + balance);
	}	
}
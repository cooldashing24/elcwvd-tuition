class CallCostDemo
{
	public static void main(String[] args)
	{
		double bal = 78.5, rate = 0.02;
		int sec = 85;
		
		System.out.println("Balance B4 Call: " + bal);
		
		double cost = sec * rate;
		bal = bal - cost;
		System.out.println("Call Duration: " + sec + " seconds");
		System.out.println("Rate per second: " + rate);
		System.out.println("Total cost 4 call: " + cost);
		System.out.println("BAlance after call: " + bal);
	}
}
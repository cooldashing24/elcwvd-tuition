class Chap7Example1Demo
{
	public static void main(String[] args)
	{
		// Call Cost
		double bal = 50.67, cost, rate = 0.015;
		int sec = 85;
		
		System.out.println("Balance b4 call: " + bal);
		
		cost = rate * sec;
		bal -= cost;

		System.out.println("Charges: " + rate + " second");
		System.out.println("Duration: " + sec + " seconds");
		System.out.println("Total Cost: " + cost);
		System.out.println("Balance aftr call: " + bal);
	}
}

class OddEvenDemo
{
	public static void main(String[] args)
	{
		int n = 441;
		System.out.println("Value of N: " + n);
		
		int rem = n % 2;
		System.out.println("Remainder: " + rem);
		if (rem == 0)
		{	
			System.out.println(n + " is an even number");
		}
		else
		{
			System.out.println(n + " is an odd number");
		}
	}
}
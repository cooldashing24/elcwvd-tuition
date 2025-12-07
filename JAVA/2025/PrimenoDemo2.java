//WAP to print all prime nos 2 between
class PrimenoDemo2
{
	public static void main (String[] swayam)
	{
		int start = 1, end = 10;
		for(int i = start; i <= end; i++)
		{
			printPrime(i);
		}
	}
	
	// method
	static void printPrime(int n)
	{
		if (n <= 1)
		{
			return;
		}
		int rem = 1;
		for(int i = 2; i < n; i++)
		{
			rem = n % i;
			if (rem == 0)
			{
				break;
			}
		}
		
		if (rem != 0)
		{
			System.out.println(n);
		}
		//System.out.println(rem == 0 ? "composite #" : "prime #");
	}
}
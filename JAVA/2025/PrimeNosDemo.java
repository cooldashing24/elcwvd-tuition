// WAP to print all prime #s between x & y
class PrimeNosDemo
{
	static boolean isPrime(int n)
	{
		//System.out.println("Jai Shree Krishna");
		
		if (n <= 1)
		{
			return false;
		}
		else if (n < 4)
		{
			return true;
		}

		
		int rem = 0;
		for(int i = 2; i < n; i++)
		{
			rem = n % i;
			//System.out.println(n + " % " + i + " = " + rem);
			if (rem == 0)
			{
				break;
			}
		}
		
		//System.out.print(n + " is a ");
		//System.out.println(rem == 0 ? "composite #" : "prime #" );
		//System.out.println(rem == 0);
		//System.out.println(rem != 0);
		
		//return rem == 0 ? false : true;
		return rem != 0;
	}
	
	public static void main(String []args)
	{
		
		int start = 1, end = 5000;
		for (int i = start; i <= end; i++)
		{
			if (isPrime(i))
			{
				System.out.println(i);
			}
			//System.out.print(i);
			//System.out.println(" is prime: " + isPrime(i));
		}
	}
}

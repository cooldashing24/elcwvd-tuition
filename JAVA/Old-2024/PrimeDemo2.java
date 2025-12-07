import java.util.*;
class PrimeSeriesDemo2
{
	static boolean hasDivisor(int n)
	{
		// prime -> false
		// non prime -> true
		if (n < 2)
		{
			System.out.println(n + " is not a prime #");
			return true;
		}
		
		boolean isDivided = false;
		int start = 2, end = n / 2;
		//System.out.println("Ending Value:" + end);
		for (int i = start; i <= end; i++)
		{
//			System.out.printf("\n%d MOD %d: %d", n, i, (n % i));
			
			if (n % i == 0)
			{
				isDivided = true;
				break;
			}
		}

		return isDivided;
	}

	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter starting number: ");
		int start = sc.nextInt();
		
		System.out.print("Enter ending number: ");
		int end = sc.nextInt();

		System.out.println("Starting value: " + start);
		System.out.println("Ending value: " + end);
		
		for (int i = start; i <= end; i++)
		{
			if (! hasDivisor(i)) //if (hasDivisor(i) == false)
			{
				System.out.println(i);
			}
		}
	}
}	











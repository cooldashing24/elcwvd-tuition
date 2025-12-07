// WAP to identify whether a provided number is prime or not
import java.util.*;
class PrimeDemo 
{
	static boolean hasDivisor(int x)
	{
		boolean isDivided = false;
		if (x < 2)
		{
			return false;
		}
		
		for (int i = 2; i < x; i++)
		{
			//System.out.println(x  + " % " + i + " = " +  x % i);
			//System.out.printf("\n%d MOD %d = %d", x, i, (x % i));
			if (x % i == 0)
			{
				isDivided = true;
				break;
			}
		}
		
		return isDivided;
	}
	
	public static void main(String []args)
	{
		// error: non-static method dezy(int) cannot be referenced from a static context
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter starting number: ");
		int start = sc.nextInt();
		
		System.out.print("Enter ending number: ");
		int end = sc.nextInt();

		System.out.println("Starting value: " + start);
		System.out.println("Ending value: " + end);
		
		for (int i = start; i <= end; ++i)
		{
			if (!hasDivisor(i))  //	if (hasDivisor(i) == false)
			{
				System.out.println(i);
			}
			
		}
	}
}










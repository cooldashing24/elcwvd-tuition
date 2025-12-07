import java.util.*;
class Chap10Ex3Demo
{
	public static void main(String[] args)
	{
		double n = 0, sq = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Zeelae value apo: ");
		try
		{
			n = sc.nextFloat();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input must be a number");
			return;
		}
		
		try
		{
			if (n < 0)
			{
				
				ArithmeticException e = new ArithmeticException();
				throw e;
			}
			sq = Math.sqrt(n);
			System.out.println("Square Root: " + sq);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("SQRT of -ve # cannot be found");
		}
	}
}
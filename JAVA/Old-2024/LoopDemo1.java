import java.util.*;
// WAP to print numbers 1 to N
class LoopDemo1
{
	public static void main(String[] args)
	{
		int  i, n = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number greater than 1: ");
		i = sc.nextInt();
		
		System.out.println("Value of I: " + i);
		System.out.println("Value of N: " + n);
		System.out.println("B4 Loop");

		while (i >= n)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("After Loop");
		
	}
}
import java.util.*;
// Print 1 to N
class LoopDemo
{
	public static void main(String[] args)
	{
		int i = 1, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value greater than 1: ");
		n = sc.nextInt();
		
		System.out.println("Value of I: " + i);
		System.out.println("Value of N: " + n);
		
		System.out.println("B4 Entering Loop");
		//loop
		while(i <= n)
		{
			System.out.println(i);
			i += 1;
		}
		
		System.out.println("After Loop");
	}
}










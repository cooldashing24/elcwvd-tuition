import java.util.*;

class Add2NosDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int x = sc.nextInt();
		
		System.out.print("Enter another number: ");
		int y = sc.nextInt();
		
		System.out.println("Value of X: " + x);
		System.out.println("Value of Y: " + y);
		
		int sum = x + y;
		System.out.println("Addition: " + sum);
		
		System.out.println("Addition: " + x + y);
		System.out.println("Addition: " + (x + y));
	}
}






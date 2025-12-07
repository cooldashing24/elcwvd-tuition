/*
	Save file with Add2IntegersDemo.java
	as Add2IntegersDemo class contains public static void main
*/
import java.util.*;

class Add2IntegersDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// input for integer number
		System.out.print("Enter a number(x): ");
		int x = sc.nextInt();	// for int type
		
		System.out.print("Enter another number(y): ");
		int y = sc.nextInt();	// for int type
		
		System.out.println("Value for X: " + x);
		System.out.println("Value for Y: " + y);
		
		int sum = x + y;
		System.out.println("Sum of x & y is " + sum);
		
		System.out.println("x + y: " + x + y);
		System.out.println("(x+y): " + (x + y));
	}
}

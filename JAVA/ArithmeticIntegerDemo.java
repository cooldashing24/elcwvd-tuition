/*
	Save file with ArithmeticIntegerDemo.java
	as ArithmeticIntegerDemo class contains public static void main
*/
class ArithmeticIntegerDemo
{
	public static void main(String[] args)
	{
		int x = 5, y = 2;

		System.out.println("Value for X: " + x);
		System.out.println("Value for Y: " + y);
		
		int sum = x + y;
		System.out.println("Sum of " + x + " & " + y + " is " + sum);
		
		//concatenation
		System.out.println("Sum x + y: " + x + y);
		
		System.out.println("Addition (x+y): " + (x + y));
		System.out.println("Difference: " + (x - y));
		System.out.println("Product: " + (x * y));
		System.out.println("Division: " + (x / y));	// Quotient
		System.out.println("Remainder: " + (x % y));
	}
}



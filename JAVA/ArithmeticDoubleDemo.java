/*
	Save file with ArithmeticDoubleDemo.java
	as ArithmeticDoubleDemo class contains public static void main
*/
class ArithmeticDoubleDemo
{
	public static void main(String[] args)
	{
		double x = 5.5, y = 2;

		System.out.println("Value for X: " + x);
		System.out.println("Value for Y: " + y);
		
		double sum = x + y;
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



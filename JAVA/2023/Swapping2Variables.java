class Swapping2Variables
{
	public static void main(String[] args)
	{
		double a = 58, b = 6366.90, c;

		System.out.println("--------- Before Swapping ---------");
		System.out.println("Value of A: " + a);
		System.out.println("Value of B: " + b);

		// Swapping
		c = a;
		a = b;
		b = c;
		
		System.out.println("--------- After Swapping ---------");
		System.out.println("Value of A: " + a);
		System.out.println("Value of B: " + b);
	}
}


/*
Step 1: Start
Step 2: Print "Enter 3 nos: "
Step 3: Read a, b & c
Step 4: sum = a + b + c
Step 5: avg = sum / 3
Step 6: Print "A: " + a
Step 7: Print "B: " + b
Step 8: Print "C: " + c
Step 9: Print "Total: " + sum
Step 10: Print "Average: " + avg
Step 11: Stop
*/

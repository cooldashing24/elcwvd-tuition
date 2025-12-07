class CheckArmstorngNo2Demo
{
	public static void main(String[] args)
	{
		int n = 123, rem, res = 0;
		int x = n;
		while (n != 0)
		{
			rem = n % 10;
			int cube = rem * rem * rem;
			res = res + cube;
			//System.out.println("N: " + n);
			//System.out.println("Remainder: " + rem);
			//System.out.println("Cube: " + cube);
			//System.out.println("Result: " + res);
			
			n = n / 10;
		}
		
		System.out.println("Original #: " + x);
		System.out.println("Result: " + res);
		
		if (x == res)
		{
			System.out.println(x + " is an armstrong");
		}
		else
		{
			System.out.println(x + " is not an armstrong");
		}
	}
}
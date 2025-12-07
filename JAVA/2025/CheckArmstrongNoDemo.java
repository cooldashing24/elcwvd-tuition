class CheckArmstrongNoDemo
{
	public static void main(String[] args)
	{
		int x = 1331, res = 0, rem;
		int n = x;
		while (n != 0)
		{
			rem = n % 10;
			n = n / 10;
			// reverse logic
			res = (res * 10) + (rem);
		}
		
		System.out.println("Original #: " + x);
		System.out.println("Reverse #: " + res);

		System.out.print(x + " is ");
		System.out.println(res == x ? "a palindrome #" : "not a palindrome");
	}
}
// Palindrome
class PalindromeNo2Demo
{
	public static void main(String[] args)
	{
		int n = 1331, rem, res = 0;
		int x = n;
		while (n != 0)
		{
			rem = n % 10;
			res = res * 10 + rem;
			n = n / 10;
		}
		
		System.out.println("Original #: " + x);
		System.out.println("Reverse #: " + res);
		
		System.out.println(x + " is ");
		System.out.println(x == res ? "a palindrome #" : "not a palindrome #");
		
		//1331 -> 1331
		//123 -> 321
	}
}






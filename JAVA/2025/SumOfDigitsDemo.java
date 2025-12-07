class SumOfDigitsDemo
{
    public static void main(String[] args) 
	{
		int x = 3761, res = 1;
		System.out.println("Number: " + x);
		while (x != 0)
		{
			res = res * (x % 10);
			x = x / 10;
		}
		
		System.out.println("Sum of digits: " + res);
		
	}
}
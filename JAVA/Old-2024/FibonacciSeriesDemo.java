/*
	Fibonacci numbers between 0 to 100
*/ 
class FibonacciSeriesDemo
{
	public static void main(String[] args)
	{
		int a = 0, b = 1, c, n = 100;
		
		while (a < n)
		{
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	}
}
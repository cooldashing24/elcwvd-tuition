class FibonacciDemo
{
    public static void main(String[] args) 
	{
		int a = 0, b = 1, n = 50, c;
		
		while(a <= n)
		{
			c = a + b;
			System.out.println(a);
			a = b;
			b = c;
		}
	}
}
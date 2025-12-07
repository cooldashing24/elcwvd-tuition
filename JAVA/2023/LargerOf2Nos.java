class LargerOf2Nos
{
	public static void main(String[] args)
	{
		double a = 101.2, b = 450.5;
		System.out.println("Value of A : " + a);
		System.out.println("Value of B : " + b);
		System.out.println(a > b);
		
		if (a > b)
		{	
			System.out.println(a + " is larger than " + b);
		}
		else
		{
			System.out.println(b + " is larger than " + a);
		}
	}
}
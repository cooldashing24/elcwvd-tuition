class OddEvenDemo
{
	public static void main(String[] args)
	{
		int a = 35, rem;
		System.out.println("Value of A : " + a);
		rem = a % 2;
		
		if(rem == 0)
		{
			System.out.println("Even");
		}	
		else
		{
			System.out.println("Odd");
		}
	}
}
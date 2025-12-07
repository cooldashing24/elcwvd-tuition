class divisibleBy50or11Demo
{
	public static void main (String[] args)
	{
		int n = 121;
		System.out.println("value of n:" + n);
		String msg = " ";
		
		if(n % 5==0)
		{
			msg = "is divisible by 5";
		}	
		else if(n%11==0)
		{
			msg = "is divisible by 11";
		}	
		else
		{
			msg = "is  not divisible by 5 or 11";
		}	
		System.out.println(n + msg);
		
	}
	
	
	
	
	
	
}
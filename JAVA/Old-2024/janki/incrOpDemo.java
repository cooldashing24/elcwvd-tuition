class incrOpDemo
{
	public static void main(String[] args)
	{
		int x = 2;
		System.out.println("Value of x:" + x);
		
		x++;
		System.out.println("Value of x++:" + x);
		
		++x;
		System.out.println("Value of ++x:" + x);
		
		x=x+1;
		System.out.println("Value of x=x+1:" + x);
		
		//pre increment
		System.out.println("++x:" + (++x));
		System.out.println("Value of x:" + x);
		
		//post increment
		System.out.println(" x++:" + (x++));
		System.out.println("Value of x:" + x);
		
	}
	
	
	
	
	
}
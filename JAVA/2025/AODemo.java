class AODemo
{
	public static void main(String[] args)
	{
		//	Number swap without variable
		int x, y;
		x = 8;
		y = 4;
		
		System.out.println("Before Swapping");
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
		
		// Swap logic
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After Swapping");
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
	}
}

class LargestOf3NosUsingLogicalOptr
{
	public static void main(String[] args)
	{
		int x = 67, y = 640, z = 80;
		System.out.println("Value of X: " + x);
		System.out.println("Value of Y: " + y);
		System.out.println("Value of Z: " + z);
		
		if (x > y && x > z)
		{
			System.out.println("X is largest");
		}
		else if (y > z)
		{
			System.out.println("Y is largest");
		}
		else
		{
			System.out.println("Z is largest");
		}
	}
}







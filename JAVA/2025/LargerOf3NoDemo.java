class LargerOf3NoDemo
{
	public static void main(String[] args)
	{
		int x = 60, y = 400, z = 700;
		
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
		System.out.println("Z: " + z);
		
		if (x > y)
		{
			//System.out.println("X is larger than Y");
			if (x > z)
			{
				System.out.println("X is larger than Y & Z");
			}
			else
			{
				System.out.println("Z is larger than Y & X");
			}
		}
		else
		{
			//System.out.println("Y is larger than X");
			if (y > z)
				System.out.println("Y is larger than Z & X");
			else
				System.out.println("Z is larger than Y & X");
		}
	}
}






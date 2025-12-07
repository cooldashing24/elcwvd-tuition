//WAP to swap 2 numbers

class SwappingDemo
{
	public static void main(String[] args)
	{
		double x = 45.8, y = 35.7, t;
		
		System.out.println("-----------Before Swapping-----------");
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
		
		// Swapping
		t = x;
		x = y;
		y = t;
		
		System.out.println("-----------After Swapping-----------");
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
	}
}







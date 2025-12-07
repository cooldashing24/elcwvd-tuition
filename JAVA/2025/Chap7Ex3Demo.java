class Chap7Ex3Demo
{
	public static void main(String[] args)
	{
		double m1 = 40, m2 = 40, m3 = 32.95;
		System.out.println("Marks 1: " + m1);
		System.out.println("Marks 2: " + m2);
		System.out.println("Marks 3: " + m3);
		
		double total = m1 + m2 + m3;
		System.out.println("Scored Total: " + total);
		
		double per = total * 0.33;
		System.out.printf("Percentage: %.2f\n", per);
		System.out.print("Grade: ");
		
		if (m1 < 33 || m2 < 33 || m3 < 33 )
		{
			System.out.println("Fail");
		}
		else if (per >= 70)
		{
			System.out.println("Distinction");
		}
		else if (per >= 60)
		{
			System.out.println("First");
		}
		else if (per >= 50)
		{
			System.out.println("Second");
		}
		else if (per >= 33)
		{
			System.out.println("Pass");
		}
	}
}









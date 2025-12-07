class PreChap7Ex3
{
	public static void main(String[] args)
	{
		double s1 = 74, s2 = 84, s3 = 24;
		double total = s1 + s2 + s3;
		
		System.out.println("Subject 1: " + s1);
		System.out.println("Subject 2: " + s2);
		System.out.println("Subject 3: " + s3);
		System.out.println("Total Score: " + total);
		
		double per = total * 0.33;
		System.out.println("Percentage: " + per);
		
		/*
		>= 70 Distinction
		>= 60 1st
		>= 50 2nd
		>= 35 Pass
		Fail*/
		
		System.out.print("Grade: ");
		
		
		if (s1 < 33 || s2 < 33 || s3 < 33)
		{
			System.out.println("Fail");
		}
		else if (per >= 70)
		{
			System.out.println("Distinction");
		}
		else if (per >= 60)
		{
			System.out.println("First class");
		}
		else if (per >= 50)
		{
			System.out.println("Second class");
		}
		else if (per >= 35)
		{
			System.out.println("Pass");
		}
		
		
		
		
	}
}
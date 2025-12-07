class Chap7Ex3
{
	public static void main(String[] args)
	{
		double per = 58.55;
		
		/*
			> 70 -> A
			> 60 -> B
			> 50 -> C
			> 35 -> Pass
			< 35 -> Jalsa
		*/
		
		System.out.println("Percentage: " + per);
		String grade;
		if (per >= 70)
		{
			grade = "A";
		}
		else if (per >= 60)
		{
			grade = "B";
		}
		else if (per >= 50)
		{
			grade = "C";
		}
		else if (per >= 35)
		{
			grade = "D";
		}
		else
		{
			grade = "F";
		}
		
		switch(grade)
		{
			case "A":
				System.out.println("Grade: A");
				break;
			case "B":
				System.out.println("Grade: B");
				break;
			case "C":
				System.out.println("Grade: C");
				break;
			case "D":
				System.out.println("Grade: D");
				break;
			case "F":
				System.out.println("Jalsa");
				break;
				
		}
	}
}
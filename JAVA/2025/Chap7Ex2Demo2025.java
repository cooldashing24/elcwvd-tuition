class Chap7Ex2Demo2025
{
	public static void main(String[] args)
	{
		byte age = 13;
		double time = 10;
		
		System.out.println("Ummar: " + age);
		System.out.println("Time: " + time);
		System.out.print("Ticket price: ");
		if (age > 13)
		{
			//System.out.println("Adult");
			System.out.println(time < 12 ? 100 : 50);
			System.out.println(
				time < 12
				? "Matinee Show: 100 Rs" 
				: "Normal Show: 50 Rs"
			);
		}
		else
		{
			//System.out.println("Child");
			
			System.out.println(time < 12 ? 40 : 60);
			System.out.println(
				time < 12
				? "Matinee Show: 40 Rs" 
				: "Normal Show: 60 Rs"
			);
		}
	}
}
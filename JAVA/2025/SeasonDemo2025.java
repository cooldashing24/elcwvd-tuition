class SeasonDemo2025
{
	public static void main(String[] args)
	{
		//m == 11 || m == 12 _ m == 1 _ m == 2 -> winter
		int m = 100;
		System.out.println("Month #: " + m);
		System.out.println("B4 Switch");
		switch(m)
		{
			case 11:
			case 12:
			case 1:
			case 2:
				System.out.println("Winter");
			break;
			
			case 3: case 4: 
			case 5: case 6:
				System.out.println("Summer");
			break;

			case 7: case 8: case 9: case 10:
				System.out.println("Monsoon");
			break;

			default:
				System.out.println("Invalid month #");
			break;
		}
		System.out.println("After Switch");
		
		/*
		
		if (m == 11 || m == 12 || m == 1 || m == 2)
		{
			System.out.println("Winter");
		}
		else if (m == 3 || m == 4 || m == 5 || m == 6)
		{
			System.out.println("Summer");
		}
		else if (m == 7 || m == 8 || m == 9 || m == 10)
		{
			System.out.println("Monsoon");
		}
		else
		{
			System.out.println("Khotu 6e baka!");
		}*/
		
	}
}
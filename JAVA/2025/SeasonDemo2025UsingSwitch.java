class SeasonDemo2025UsingSwitch
{
	public static void main(String[] args)
	{
		int m = 40;
		System.out.println("Month #: " + m);
		switch(m)
		{
			case 11:
			case 12:
			case 2:
			case 1:
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
	}
}
class WeekdayDemo2025UsingSwitch
{
	public static void main(String[] args)
	{
		char c = 'A';
		System.out.println("Original Character: " + c);
		c = Character.toLowerCase(c);
		System.out.println("Lower Character: " + c);

		switch(c)
		{
			case 'a': case 'e': case 'i': case 'o': case 'u': 
				System.out.println("Vowel");
			break;
			
			case 'q': case 'r': case 'b':
				System.out.println("Consonant");
			break;
				
			default:
				System.out.println("Neither a Vowel nor a Consonant");
			break;
		}
	}
}
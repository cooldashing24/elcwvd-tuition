class PalindromeDemo2
{
	public static void main(String[] args)
	{
		String name = "1331";
		System.out.println("Naam: " + name);

		StringBuffer sb1 = new StringBuffer(name);
		
		sb1.reverse();
		String reverseName = sb1.toString();
		System.out.println("Reverse: " + reverseName);
		
		/*
		System.out.println(reverseName.equals(name));
		System.out.println(reverseName.equalsIgnoreCase(name));
		*/
		
		boolean isSame = reverseName.equalsIgnoreCase(name);
		
		if (isSame)
		{
			System.out.println("Is a Palindrome");
		}
		else
		{
			System.out.println("Is not a Palindrome");
		}
		
		/*System.out.println(isSame ? "Is a Palindrome" : "Is not a Palindrome");*/
	}
}

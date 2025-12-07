class PalindromeDemo
{
	public static void main(String[] args)
	{
		String name = "LOl";
		System.out.println("Naam: " + name);

		StringBuffer sb1 = new StringBuffer(name);

		sb1.reverse();
		String reverseName =  sb1.toString();
		System.out.println("Ultu Naam: " + reverseName);
		
		//System.out.println(reverseName == name);
		System.out.println("Equals: " + name.equals(reverseName));
		System.out.println("Equals Ignore Case: " +name.equalsIgnoreCase(reverseName));
		
		boolean isSame = name.equalsIgnoreCase(reverseName);

		if (isSame)
		{
			System.out.println("Is a Palindrome");
		}
		else
		{
			System.out.println("Is not a Palindrome");
		}
		
		//System.out.println(isSame ? "Is a Palindrome" : "Is not a Palindrome");
	
	}
}
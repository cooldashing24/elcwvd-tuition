class StringCompareDemo
{
	public static void main(String[] args)
	{
		String s1 = "Hain!";
		String s2 = "hain!";
		System.out.println("String 1: " + s1);
		System.out.println("String 2: " + s2);

		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1 == s1: " + (s1 == s1));
		
		System.out.println("Equals: " + s1.equals(s2));
		System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2));
		
		// Comparing ASCII Value
		System.out.println("Comp 2: " + s1.compareTo(s2));
		System.out.println("Comp 2 Ignore Case: " + s1.compareToIgnoreCase(s2));
		
	}	
}
class InitStringDemo
{
	public static void main(String[] chaloDhyanApo)
	{
		// String is a collection of characters
		// Array is a collection of elements of same datatype
		
		char city[] = {'S', 'u', 'r', 'a', 't'};
		System.out.print("Character Array: ");
		System.out.println(city);
		
		// Empty String
		String mtStr = new String();
		System.out.println("Khali Dori: " + mtStr);

		// Passing character array as a parameter
		String s1 = new String(city);
		System.out.println("Maru shaher: " + s1);
		
		// Passing string as a parameter
		String s2 = new String("India");
		System.out.println("My country: " + s2);
		
		// Passing string object as a parameter
		String s3 = new String(s2);
		System.out.println("S3: " + s3);
		
		// Substring for character array
		String s4 = new String(city, 2, 3);
		System.out.println("S4: " + s4);
	}
}






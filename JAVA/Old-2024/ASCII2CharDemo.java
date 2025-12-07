// WAP to print character  for a given ASCII value.

class ASCII2CharDemo
{
	public static void main(String[] args)
	{
		byte 
		x = 65;
		System.out.println("ASCII: " + x);
		// typecast
		System.out.println("Character: " + (char)x);
		
		

		System.out.println("-------------------------");
		x = 97;
		// typecast
		char ch = (char)x;
		
		System.out.println("ASCII value: " + x);
		System.out.println("Character: " + ch);
		
		
	}
}
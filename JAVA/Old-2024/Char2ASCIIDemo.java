// WAP to print ASCII value of a given input character.

class Char2ASCIIDemo
{
	public static void main(String[] args)
	{
		char ch = '&';
		System.out.println("Character: " + ch);
		// typecast
		System.out.println("ASCII: " + (int)ch);
		
		System.out.println("-------------------------");
		ch = '(';
		int ascii = ch;
		
		System.out.println("Character: " + ch);
		// typecast
		System.out.println("ASCII value: " + ascii);
	}
}
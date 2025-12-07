class Swapping2VarsWithTempVar
{
	public static void main(String[] args)
	{
		char hash = '*', asterisk = '#', temp;
		
		System.out.println("-----B4 Swapping-----");
		System.out.println("Hash Symbol: " + hash);
		System.out.println("Asterisk Symbol: " + asterisk);
		
		temp = hash;
		hash = asterisk;
		asterisk = temp;
			
		System.out.println("-----After Swapping-----");
		System.out.println("Hash Symbol: " + hash);
		System.out.println("Asterisk Symbol: " + asterisk);
	}
}
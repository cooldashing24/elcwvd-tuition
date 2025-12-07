 class SwapWithTempVariableDemo
{
	public static void main(String[] args)
	{
		//	Number swap with variable
		char hash = '*', asterisk = '#', nobita;

		System.out.println("Before Swapping");
		System.out.println("Hash Symbol: " + hash);
		System.out.println("Asterix: " + asterisk);
		
		// Swap logic
		nobita = hash;
		hash = asterisk;
		asterisk = nobita;
		
		System.out.println("After Swapping");
		System.out.println("Hash Symbol: " + hash);
		System.out.println("Asterix: " + asterisk);
	}
}

class VariableDemo
{
	public static void main(String[] args)
	{
		// Single-line comment
		/* 
		
			Multi-line comment
			dataType variableName		// declaration
		*/
		byte age;	// declaration
		age = 25;
		System.out.println("User age: " + age);
		
		short penPrice = 310;
		System.out.println("Price of a pen: Rs." + penPrice);
		
		penPrice = 325;
		System.out.println("New price of a pen: Rs." + penPrice);

		
		String firstName = "Kate";
		System.out.println("Hello " + firstName);
		
		// declaration & initialization
		double laptopPrice = 42055.3;
		System.out.println("Price of a laptop: " + laptopPrice);
		
		
		boolean canVote = true;
		System.out.println(canVote);
		
		char dollar = '$';
		System.out.println("Symbol of USD: " + dollar);
		
		
		char Dollar = '*';
		System.out.println("Symbol: " + Dollar);
	}
}





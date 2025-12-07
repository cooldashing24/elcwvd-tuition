class Variables2Demo
{
	public static void main(String[] args)
	{
		// Syntax for declaration: dataType variableName
		double weight;
		int totalBooks;	// declaration
		// uncommenting below line will generate an error because value is not assigned to totalBooks
		//	System.out.println(totalBooks);
		totalBooks = 24;	// initialization
		System.out.println("#Books: " + totalBooks);
		
		char dollarSymbol;
		dollarSymbol = '$';
		System.out.println("USD Symbol: " + dollarSymbol);
		
		// dataType variable = value;
		// declaration & initialization
		long totalAnts = 48989749786548478L;
		System.out.println(totalAnts);
		
		weight = 55.8;
		System.out.println("Vajan: " + weight);
		weight = 75.8;
		System.out.println("Vajan after re-assign: " + weight);
		
		// -10^38 to 10^38		-> float
		// -10^308 to 10^308 	-> double
		
		float height = 6.7F;
		System.out.println("Unchai: " + height);
		//System.out.println((byte)2056);
		
		byte age = 12;
		System.out.println("Ummar: " + age);
	}
}

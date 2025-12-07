class VariableDemo6July20241
{
	public static void main(String[] args)
	{
		// declaration
		double weightOfTower;
		// Uncommenting below line will generate an error
		// as a value is not assign to the variable
		//System.out.println("Tavar nu vajan: " + weightOfTower);
		
		weightOfTower = 670.57;
		System.out.println("Tavar nu vajan: " + weightOfTower);
		
		// Uncommenting below line will generate an error
		// as variable is already declared
		//double weightOfTower = 700.57;
		System.out.println("Tavar nu navu vajan: " + weightOfTower);
		
		String firstName = "Daniel", lastName = "Smith";
		String akhuNaam = firstName + " " +lastName;
		System.out.println("Hello, " + akhuNaam);
		
		char dollar = '$';
		System.out.println("USD Symbol: " + dollar);
		
		byte age = 88;
		System.out.println("Age: " + age);
		
		// Uncommenting below line will generate an error
		// as the value is out of byte range i.e -128 to 127
		//age = 177;
		System.out.println("Age: " + age);
		
		boolean canVote = false;
		System.out.println("Eligible to vote: " + canVote);
	}
}










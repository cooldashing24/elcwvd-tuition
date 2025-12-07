class VariableDemo45
{
	public static void main (String[] args)
	{
		// declaration
		double weightOfTower;
		// Uncommenting below line will generate an error
		// as weightOfTower has not been assigned a value
		// System.out.println("Tavar nu vajan: " + weightOfTower);
		weightOfTower = 450.27;
		System.out.println("Tavar nu vajan: " + weightOfTower);
		
		weightOfTower = 480.38;
		System.out.println("Tavar nu navu vajan: " + weightOfTower);
		
		byte totalBooks = 48;
		System.out.println("Total Books: " + totalBooks);
		// Uncommenting below line will generate an error
		// as value is out of byte range 
		//totalBooks = 580;
		System.out.println("Total Books: " + totalBooks);
		
		boolean canVote = true;
		System.out.println("Eligible to Vote: " + canVote);
		
		char dollar = '$';
		System.out.println("USD Symbol: " + dollar);
		
		String firstName = "Kate", lastName = "Beckinsale";
		String akhuNaam = firstName + " " + lastName;
		System.out.println("Hello, " + akhuNaam );
		
	}
}










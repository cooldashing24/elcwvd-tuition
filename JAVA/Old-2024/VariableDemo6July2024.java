class VariableDemo6July2024
{
	public static void main(String[] parthu)
	{
		//declaration
		double weightOfTower;
		//System.out.println("Tavar nu Vajan:" + weightOfTower);
		//initialize
		weightOfTower = 566.44;
		System.out.println("Tavar nu Vajan:" + weightOfTower);
		
		// Redeclaring variable is not allowed
		//double weightOfTower = 789.66;
		
		weightOfTower = 789.66;
		System.out.println("New weight: " + weightOfTower);
		// Uncommenting below line will generate an error 
		// because string cannot be assigned to double type of variable
		//weightOfTower = "Hello";
		
		String firstName = "Daniel", lastName = "Smith";
		String fullNaam = firstName + " " +lastName;
		System.out.println("Hello, " + fullNaam);
		
		byte totalStudents = 52;
		System.out.println("Total Students: " + totalStudents);
		
		//totalStudents = 152;
		System.out.println("Total Students: " + totalStudents);
		
		char dollar = '$';
		System.out.println("USD Symbol: " + dollar);
		
		boolean canVote = false;
		System.out.println("Eligible to Vote: " + canVote);
	}
}









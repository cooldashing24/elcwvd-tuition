class VariableDemo
{
	public static void main(String[] args)
	{
		// single line comment
		/*
			Multi-line comment
		*/
		
		
		//dataType variableName;
		
		double weightOfBag;	//declaration
		weightOfBag = 67.3;	// initialize
		
		System.out.println("Bag nu vajan: " + weightOfBag);
		weightOfBag = 52;	// re-initialize
		System.out.println("New weight: " + weightOfBag);
		
		
		int  totalStudents = 7;
		System.out.println("Cool Vidyarthio: " + totalStudents);
		
		/*float
		long
		int
		short
		byte
		char*/
		boolean canVote = true;
		System.out.println("Are you eligible to vote? " + canVote);
		
		
		
		String firstName = "Krishiv";
		System.out.println("Hello " + firstName);
		
		
		char hash = '#';
		System.out.println(hash  + "WorldChampion");
	}
} 

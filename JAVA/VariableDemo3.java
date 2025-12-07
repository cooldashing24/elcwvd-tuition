class VariableDemo3
{
	public static void main(String[] args)
	{
		// dataType variableName
		int totalEmployee = 5200;		// declaration
		System.out.println(totalEmployee);
		// Uncommenting below line will generate an error as value data-type is different
		//totalEmployee = "Five Thousand";
		
		System.out.println("Total employee: " + totalEmployee);
		
		// declaration with initialization
		char dollar = '$';
		System.out.println("Dollar Symbol: " + dollar);
		
		byte age = 45;
		System.out.println("Age: " + age);
		// Uncommenting below line will generate an error as the value is not within byte range
		//age = 7897;
		System.out.println("Age: " + age);
		
	}
}





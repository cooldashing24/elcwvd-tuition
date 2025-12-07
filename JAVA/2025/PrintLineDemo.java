// Polymorphism

class PrintLineDemo
{
	static void printLine()
	{
		printLine('=', 5);
	}
	
	static void printLine(char c)
	{
		printLine('d', 1);
	}
	
	static void printLine(char c, int n)
	{
		for (int i = 1; i <= n; i++)
		{
			System.out.print(c);
		}
		
		System.out.println();
	}
	
	public static void main(String []args)
	{
		printLine();
		
		printLine('A');

		printLine('^', 5);
		
	}
}

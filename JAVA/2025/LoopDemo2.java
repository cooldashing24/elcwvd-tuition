// OddNumbersDemo
class LoopDemo2
{
	public static void main (String[]args)
	{
		int i = 1, n = 5, result = 1;

		while (i <= n)
		{
			result = result * i;
			i++;
		}
		
		System.out.println("Factorial: " + result);
	}
}
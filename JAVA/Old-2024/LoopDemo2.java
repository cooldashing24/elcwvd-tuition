// WAP to calculate sum of numbers starting from 1 to 10
//SumOfSeriesDemo
class LoopDemo2
{
	public static void main(String[] goodMorning)
	{
		//declare & initialize
		int i = 1, n = 50;
		while (i <= n)
		{
			System.out.print("\n" + i + " ");
			if (i % 3 == 0 && i % 5 == 0)
			{
				System.out.print("BuzzFizz");
			}
			else if (i % 3 == 0)
			{
				System.out.print("Buzz");
			}
			else if (i % 5 == 0)
			{
				System.out.print("Fizz");
			}
			
			
			i++;
		}
	}
}
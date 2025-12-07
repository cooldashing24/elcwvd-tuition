class DoDemo
{
	public static void main(String[] args)
	{
		char p1 = 'p', p2 = 's';
		
		System.out.println("Player1: " + p1);
		System.out.println("Player2: " + p2);
		
		if (p1 == p2)
		{
			System.out.println("Draw");
		}
		else if ((p1 == 'r' && p2 == 's') || (p1 == 'p' && p2 == 'r') || (p1 == 's' && p2 == 'p'))
		{
			System.out.println("Player 1 wins");
		}
		else
		{
			System.out.println("Player 2 wins");
		}
	}
}
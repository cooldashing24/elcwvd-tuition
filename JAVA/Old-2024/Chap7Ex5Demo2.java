class Chap7Ex5Demo2
{
	public static void main(String[] args)
	{
		double j = 0;
		for (int i = 5; j < 50 ; i++)
		{
			j = Math.sqrt(i);
			System.out.printf("\n SQRT of %d is %f", i, j);
		}
		
		System.out.println();
	}
}
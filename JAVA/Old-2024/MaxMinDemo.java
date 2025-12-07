class MaxMinDemo
{
	public static void main(String[]args)
	{
		//dataType variable[] 
		double x[] = {4,98,894,98,789,4,5498,48941,41};
		double max = x[0], min = x[0];
		
		int totEle = x.length;
		System.out.println("#Elements: " + totEle);
		
		for(int i = 0; i < totEle; i++)
		{
			System.out.printf("\nX[%d]: %.3f", i, x[i]);
			if (max < x[i])
			{
				max = x[i];
			}
			
			if (min > x[i])
			{
				min = x[i];
			}
		}
		System.out.println();
		System.out.println("Mahattam: " + max);
		System.out.println("Nyunattam: " + min);
		System.out.println();
	}
}


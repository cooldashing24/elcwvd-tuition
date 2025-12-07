class MaxMinAvgDemo
{
	public static void main(String[] args)
	{
		double x[] = {18,9401,9,49,874,98,8,65,89,45};
		double max = x[0], min = x[0], total = 0;
		
		int i = 0, n = x.length;		// total # of elements
		for(i = 0; i < n; i++)
		{
			System.out.println("X[" + i + "]: " + x[i]);
			total = total + x[i];
			if (max < x[i])
			{
				max = x[i];
			}
			
			if (min > x[i])
			{
				min = x[i];
			}
		}
		
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
		System.out.println("Average: " + (total / n));
	}
}
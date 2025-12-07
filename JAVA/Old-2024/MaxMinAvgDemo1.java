class MaxMinAvgDemo1
{
	public static void main(String[] args)
	{
		double x[] = {18,9401,9,49,874,98,8,65,89,45};
		double total = 0, max = x[0], min = x[0];
		int i, n = x.length;
		
		for (i = 0; i < n; i++)
		{
			total = total + x[i];
			System.out.println("X[" + i + "]: " + x[i] );
			
			if (max < x[i])
			{
				max = x[i];
			}
			
			if (min > x[i])
			{
				min = x[i];
			}
		}
		
		System.out.println("#Elements: " + n);
		System.out.println("Sum: " + total);
		System.out.println("Average: " + (total / n));
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
	}
}
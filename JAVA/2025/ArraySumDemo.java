class ArraySumAvgDemo
{
	public static void main(String[] args)
	{
		// array
		double x[] = new double[5];
		double result = 0;
		
		x[0] = 76;
		x[1] = 101;
		x[2] = 147;
		x[3] = 852;
		x[4] = 835;
		
		int totEle = x.length;
		System.out.println("Total Elements: " + totEle);

		int lastIndex = totEle - 1;
		System.out.println("Last Index: " + lastIndex);

		System.out.println("----- Array Elements -----");
		for(int i = 0; i < totEle; i++)
		{
			System.out.println("X[" + i + "]: " + x[i]);
			result = result + x[i];
		}
		
		System.out.println("Sum: " + result);
		System.out.println("Average: " + result / totEle);
	}
}







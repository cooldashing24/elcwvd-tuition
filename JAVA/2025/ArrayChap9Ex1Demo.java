class ArrayChap9Ex1Demo
{
	public static void main(String[] args)
	{
		double[] taapmaan = {23.5, 24.5, 25.7, 26.7, 23.5, 32.5, 28.7, 30.7, 23.5, 24.5, 25.7, 20.7};
		//double[] taapmaan = {-23.5, -24.5, -25.7};

		double max = taapmaan[0];
		double min = taapmaan[0];
		
		int totEle = taapmaan.length;
		System.out.println("Total Elements: " + totEle);
		
		System.out.println("------Array Elements------");
		
		for (int i = 0; i < totEle; i++)
		{
			System.out.println("Temp[" + i + "]: " + taapmaan[i]);
			
			if (max < taapmaan[i])
			{
				max = taapmaan[i];
			}
			
			if (min > taapmaan[i])
			{
				min = taapmaan[i];
			}
		}
		
		
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
		
	}
}







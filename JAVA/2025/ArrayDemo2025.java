// Ex_Q1
class ArrayDemo2025
{
	public static void main(String khushiChinese[])
	{
		double[] taapmaan = {23.5, 24.5, 24.12, 25.7, 26.9, 27.8, 27.5, 28.0, 8.2, 31.5, 33.4, 30.5};
		double max = taapmaan[0];
		double min = taapmaan[0];
		
		// maximum, minimum, average

		int totElements = taapmaan.length;
		System.out.println("Total Elements: " + totElements);

		for(int i = 0; i < totElements; i++)
		{
			System.out.println("Temp[" + i +  "]: " + taapmaan[i]);
			
			if (max < taapmaan[i])
			{
				max = taapmaan[i];
			}
			
			if (min > taapmaan[i])
			{
				min = taapmaan[i];
			}
		}

		System.out.println("Sav thi moti kimmat: " + max);
		System.out.println("Sav thi nani kimmat: " + min);
	}
}

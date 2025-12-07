import java.util.Arrays;

class FillSortArrayDemo2
{
	static void display(double x[])
	{
		int nEle = x.length;
		System.out.println("#Elements: " + nEle);
		
		for (int i = 0; i < nEle; i++)
		{
			System.out.println("Arr[" + i + "]: " + x[i]);
		}
	}
	
	public static void main(String[] args)
	{
		// datatype arrayName[] = new datatype[SIZE];
		double j[] = new double[5];

		// datatype[] arrayName = {values, ......};
		double[] nos = {1,789,498,4,8, -97,98,9.8,4,98};
		
		display(nos);
		
		// Sort -> Complete, Partial
		System.out.println("-------- Partial Sort -------- ");
		// Syntax: Arrays.sort(arrayName, startIndex, endIndex);
		// endIndex is an exclusive
		Arrays.sort(nos, 3, 7);

		display(nos);
		
		System.out.println("-------- Complete Sort -------- ");
		// Syntax: Arrays.sort(arrayName);
		Arrays.sort(nos);
		
		display(nos);
		
		// Fill -> Complete, Partial
		System.out.println("-------- Partial Fill -------- ");
		// Syntax: Arrays.fill(arrayName, startIndex, endIndex, value);
		// endIndex is an exclusive
		Arrays.fill(nos, 2, 8, 150.77);
		
		display(nos);
		
		System.out.println("-------- Complete Fill -------- ");
		// Syntax: Arrays.fill(arrayName, value);
		Arrays.fill(nos, 100);
		display(nos);

	}
}
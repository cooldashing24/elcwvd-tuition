import java.util.Arrays;

class FillSortArrayDemo3
{
	static void display(double x[])
	{
		int nEle = x.length;
		System.out.println("#Elements: " + nEle);
		
		for (int i = 0; i < nEle; i++)
		{
			System.out.println("Array[" + i + "]: " + x[i]);
		}
	}
	
	
	public static void main(String[] args)
	{
		// datatype array[] = new datatype[SIZE];
		// double j[] = new double[10];
		
		// datatype array[] = {values, ......};
		double nos[] = {987,987,89,4981,4,9,89,1};
		display(nos);
		
		System.out.println("-------- Partial Sorting -------- ");
		
		// Partial Sort
		Arrays.sort(nos, 2, 6);
		display(nos);
		
		// Complete Sort
		Arrays.sort(nos);
		display(nos);
	}
}

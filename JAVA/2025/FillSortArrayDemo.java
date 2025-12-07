import java.util.Arrays;
//import java.util.*;

class FillSortArrayDemo
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
		// Arrays.sort(arrayName, startIndex, endIndex);
		// endIndex is exclusive
		Arrays.sort(nos, 3, 6);

		display(nos);
		
		
		// Complete
		System.out.println("-------- Complete Sorting --------");
		// Arrays.sort(arrayName);
		Arrays.sort(nos);

		display(nos);
		

		System.out.println("-------- Partial Fill -------- ");
		// Arrays.fill(arrayName, startIndex, endIndex, value);
		// endIndex is exclusive
		Arrays.fill(nos, 3, 6, 10);

		display(nos);
		
		System.out.println("-------- Complete Fill -------- ");
		// Arrays.fill(arrayName, value);
		Arrays.fill(nos, 5);

		display(nos);
	}
}







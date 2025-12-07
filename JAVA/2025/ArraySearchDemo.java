class ArraySearchDemo
{
	static void display(double a[])
	{
		System.out.println("------ Array Elements ------");
		int nEle = a.length;
		System.out.println("#Elements: " + nEle);

		// display loop
		for (int i = 0; i < nEle; i++)
		{
			System.out.println("Arr[" + i + "]: " + a[i]);
		}
	}
	
	public static void main(String[] chaloDhyanApo)
	{
		double []x = {14, 4894, 89, 18, 4, 25, 89};	// array
		
		display(x);
		
		sodhvu(x, 45);
		
		
		double []y = {4, 25, 89};	// array
		
		display(y);
		//search = 89;
		sodhvu(y, 89);
		
	}
	
	
	static void sodhvu(double []arr, int search)
	{
		int nEle = arr.length;
		boolean isFound = false;
		System.out.println("Search Element: " + search);
		// search loop
		for (int i = 0; i < nEle; i++)
		{
			if (arr[i] == search)
			{
				System.out.println(search + " found at index " + i);
				isFound = true;
			}
		}
		
		if (isFound == false)
		{
			System.out.println(search + " not found");
		}
	}
}
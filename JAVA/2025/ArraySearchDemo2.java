class ArraySearchDemo2
{
	static void display(double[] a)
	{
		int nEle = a.length;
		System.out.println("#Elements: " + nEle);
		for(int i = 0; i < nEle; i++)
		{
			System.out.println("Arr[" + i + "]: " + a[i]);
		}
	}

	public static void main(String[] riddhiCompileKartaBhuliGai)
	{
		double[] x = {9,84,79,8,19,74,};
		display(x);
		shodhvu(x, 24);
		System.out.println("---------- Bijo Array ----------");
		double[] y = {9,84,2.6,2,-1,894,-8,4,4};
		display(y);
		
		shodhvu(y, 4);
	}

	static void shodhvu(double []a, double search)
	{
		int nEle = a.length;
		System.out.println("Search Element: " + search);
		boolean isFound = false;
		for(int i = 0; i < nEle; i++)
		{
			
			if (a[i] == search)
			{
				System.out.println(search + " found at index " + i);
				isFound = true;
			}
		}
		
		if(isFound != true)
		{
			System.out.println(search + " not found");
		}
	}
}






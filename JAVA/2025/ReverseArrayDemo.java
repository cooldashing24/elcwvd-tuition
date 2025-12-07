class ReverseArrayDemo
{
	public static void main(String []args)
	{
		char[] name = {'A', 'n', 'g', 'l', 'e'};

		int totEle = name.length;
		System.out.println("# Elements: " + totEle);

		System.out.println("-----Array Elements-----");
		
		for (int i = 0;  i < totEle; i++)
		{
			System.out.print(name[i]);
		}
		
		
		int lastIndex = totEle - 1;
		System.out.println("\nLast Index: " + lastIndex);
		for (int i = lastIndex;  i >= 0; i--)
		{
			System.out.print(name[i]);
		}
		
		
		System.out.println();
		
	}
}
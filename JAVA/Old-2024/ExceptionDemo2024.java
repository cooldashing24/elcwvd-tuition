class ExceptionDemo2024
{
	public static void main(String[] args)
	{
		int x = 5, y = 1;
		int a[] = {48,9,498,7,8,97,98,7,98,89};
		
		try
		{
			System.out.println("X/Y: " + x / y);
			System.out.println(a[555]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can't divide by ZERO");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index does not exist");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Inside FInally");
		}
		
		// ArithmeticException
		//ArrayIndexOutOfBoundsException
	}
}
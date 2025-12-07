class Chap7Ex5Demo
{
    public static void main(String[] args) 
	{
		
		double x = 25, n = 50;
		//double i = Math.sqrt(x);
		double i = x;
		
		while (i <= n)
		{
			System.out.println(i);
			i++;
			i = Math.sqrt(i);
			//i++;
		}//
		
	}
}
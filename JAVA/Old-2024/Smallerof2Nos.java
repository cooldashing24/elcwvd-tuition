class Smallerof2Nos
{
	public static void main(String[]args) 
	{
		int a=23 , b=7;
		System.out.println("Value of A: "+a);
		System.out.println("Value of B:"+b);
		
		System.out.println(a < b ? "a is smaller" : "b is smaller");
		
		int c = a < b ? a : b;
		System.out.println(c + " is smaller");
		
		
	}
}
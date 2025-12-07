public class PrimeCheckDemo
{
    public static void main(String[] args) 
	{
        int n = 49, i = 2, rem = 0;
//        System.out.println("B4 loop");
        
        while (i < n) 
		{
            rem = n % i;
//            System.out.println(n + " % " + i + " : " + rem);
            if (rem == 0) 
			{
                break;
            }
            i = i + 1;
        }

		System.out.print(n + " is a ");
System.out.println(rem != 0 ? "prime #" : "composite #");	
    }
}
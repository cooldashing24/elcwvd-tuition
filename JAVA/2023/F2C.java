import java.util.*;

class F2C
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter FAHRENHEIT: ");
		double f = sc.nextDouble();
		
		double c = (f - 32) *  0.56;
		
		System.out.println("Fahrenheit: " + f);
		System.out.println("Celsius: " + c);
	}
}

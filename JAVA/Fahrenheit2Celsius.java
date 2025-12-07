/*
	Save file with Fahrenheit2Celsius.java
	as Fahrenheit2Celsius class contains public static void main
*/
import java.util.*;

class Fahrenheit2Celsius
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter fahreiheit: ");
		double f = sc.nextDouble();
		double c = (f - 32) * 0.56;
		
		System.out.println(f + " fahrenheit = " + c + " celsius");
	}
}

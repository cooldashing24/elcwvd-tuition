/*
	Save file with Paise2RupeesDemo.java
	as Paise2RupeesDemo class contains public static void main
*/
import java.util.*;

class Paise2RupeesDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter paise: ");
		double ps = sc.nextDouble();
		double rs = ps / 100;

		System.out.println("Rupees: " + rs);
		System.out.println("Paise: " + ps);
		
		System.out.println(ps + " paise = " + rs + " rupees");
	}
}

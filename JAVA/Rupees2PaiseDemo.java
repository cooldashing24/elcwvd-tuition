/*
	Save file with Rupees2PaiseDemo.java
	as Rupees2PaiseDemo class contains public static void main
*/
import java.util.*;

class Rupees2PaiseDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rupees: ");
		double rs = sc.nextDouble();
		double ps = rs * 100;

		System.out.println("Rupees: " + rs);
		System.out.println("Paise: " + ps);
		
		System.out.println(rs + " rupees = " + ps + " paise");
	}
}

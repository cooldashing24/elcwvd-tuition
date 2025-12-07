import java.util.*;
class UserinputDemo
{ 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's your good name?");
		String name = sc.nextLine();
		System.out.println("Hello" + name);
		
		System.out.println("What's your age?");
		int age= sc.nextInt();
		System.out.println("you're" + age + "year old");
		
		System.out.println("What's your height?");
		double ht= sc.nextDouble();
		System.out.println("you're height is" + ht + "feet");
	}
	
	
	
	
}
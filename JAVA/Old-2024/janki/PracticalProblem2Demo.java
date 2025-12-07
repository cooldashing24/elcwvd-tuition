import java.util.*;
class PracticalProblem2Demo
	{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter temperature:");
			double temp = sc.nextFloat();
		
			System.out.println("Temperature:" + temp);
			if(temp >= 85)
			{
					System.out.println("Hot");
			}	
			else if (temp >= 65 && temp < 85)
			{
				System.out.println("warm");
			}	
			else if (temp >= 55 && temp < 65)
			{
				System.out.println("cool");
			}
			else
			{
				System.out.println("cold");
			}
		}
	}
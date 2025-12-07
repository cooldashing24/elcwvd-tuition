import java.util.*;
class bonusDemo123
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter job type(m/n):");
		char jobType = sc.nextLine().charAt(0);
		
		System.out.print("Enter job years:");
		int exp = sc.nextInt();
		double bonus = 0;
		if (jobType == 'm')
		{
			System.out.print(" job type: Manager" );
			if(exp >= 10)
			{
				bonus=50000;
			}
			else
			{
				bonus=20000;
			}	
		}
		else if (jobType=='n')
		{
			System.out.println("job type: non manager");
			bonus = exp >= 10 ? 20000 : 10000;
		}
		else
		{
			System.out.println("job type: invalid");
		}	
			System.out.println("Bonus Amount:" + bonus);
	}
	
	
	
	
}
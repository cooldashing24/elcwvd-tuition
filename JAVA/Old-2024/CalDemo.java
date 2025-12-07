import java.util.*;

class CalDemo
{
	static void display(GregorianCalendar gc)
	{
		System.out.println("-----------------------------");
		System.out.println("Varas: " + gc.get(gc.YEAR));
		System.out.println("Mahino: " + (gc.get(gc.MONTH) + 1));
		System.out.println("Tarikh: " + gc.get(gc.DAY_OF_MONTH));
		System.out.print("Kalak: " + gc.get(gc.HOUR));
		System.out.println(gc.get(gc.AM_PM) == 1 ? " PM" : " AM");
		System.out.println("Minute: " + gc.get(gc.MINUTE));
		System.out.println("Kshan: " + gc.get(gc.SECOND));
		System.out.println("Week Day: " + gc.get(gc.DAY_OF_WEEK));

		switch(gc.get(gc.DAY_OF_WEEK))
		{
			case 1:
				System.out.println("Sunday");
			break;
			
			case 2:
				System.out.println("Monday");
			break;
			
			case 3:
				System.out.println("Tuesday");
			break;
			
			case 4:
				System.out.println("Wednesday");
			break;
			
			case 5:
				System.out.println("Thursday");
			break;
			
			case 6:
				System.out.println("Friday");
			break;
			
			case 7:
				System.out.println("Saturday");
			break;
		}
	}

	public static void main(String[] args)
	{
		GregorianCalendar g1 = new GregorianCalendar();
		//System.out.println(g1);
		display(g1);
		
		GregorianCalendar g2 = new GregorianCalendar(2007, 9, 25);
		display(g2);
		GregorianCalendar g3 = new GregorianCalendar(2006, GregorianCalendar.DECEMBER, 11, 5, 88, 90);
		display(g3);
		
	
		
		
	}
}














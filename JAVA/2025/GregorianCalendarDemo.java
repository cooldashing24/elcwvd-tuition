import java.util.*;

class GregorianCalendarDemo
{
	static void display(GregorianCalendar gc)
	{
		System.out.println("------------------");
		System.out.println("Varas: " + gc.get(gc.YEAR));
		System.out.println("Mahino: " + gc.get(gc.MONTH));
		System.out.println("Divas: " + gc.get(gc.DAY_OF_MONTH));
		System.out.print("Kalak: " + gc.get(gc.HOUR));
		System.out.println(gc.get(gc.AM_PM) == 1 ? " PM" : " AM");
		System.out.println("Minutes: " + gc.get(gc.MINUTE));
		System.out.println("Seconds: " + gc.get(gc.SECOND));
		//2:18:55 PM
		
        int wk = gc.get(gc.DAY_OF_WEEK);
        switch (wk) 
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
            default:
                System.out.println("Invalid");
                break;
        }
	}
	
	public static void main(String []args)
	{
		GregorianCalendar gc1 = new GregorianCalendar();
		System.out.println(gc1);
		display(gc1);
		
		GregorianCalendar gc2 = new GregorianCalendar(2008, 8, 4);
		//System.out.println(gc2);
		display(gc2);
		
		GregorianCalendar gc3 = new GregorianCalendar(2008, 4, 15, 8, 30, 44);
		//System.out.println(gc3);
		display(gc3);

	}
}

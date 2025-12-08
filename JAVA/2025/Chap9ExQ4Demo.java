import java.util.*;

class Chap9ExQ4Demo
{
	static void display(GregorianCalendar gc)
	{
		int mon = gc.get(gc.MONTH);
		
		String monthTitle = "";
		switch (mon)
		{
			case 0:
                monthTitle = "Jan";
                break;
            case 1:
                monthTitle = "Feb";
                break;
            case 2:
                monthTitle = "Mar";
                break;
            case 3:
                monthTitle = "Apr";
                break;
            case 4:
                monthTitle = "May";
                break;
            case 5:
                monthTitle = "Jun";
                break;
            case 6:
                monthTitle = "Jul";
                break;
            case 7:
                monthTitle = "Aug";
                break;
            case 8:
                monthTitle = "Sep";
                break;
            case 9:
                monthTitle = "Oct";
                break;
            case 10:
                monthTitle = "Nov";
                break;
            case 11:
                monthTitle = "Dec";
                break;
            default:
                System.out.println("Invalid");
                break;
        }
		
		System.out.print(gc.get(gc.DAY_OF_MONTH) + "-");
		System.out.print(monthTitle + "-");
		System.out.println(gc.get(gc.YEAR));
	}

	public static void main(String []args)
	{
		
		GregorianCalendar gc1 = new GregorianCalendar();
		System.out.println(gc1);
		display(gc1);
		
		GregorianCalendar gc2 = new GregorianCalendar(2009, 0, 2);
		display(gc2);
		
		/*
		YEAR=2025,
	MONTH=11,
	DAY_OF_MONTH=7
		*/
		
		//7-Dec-2025
	}
}


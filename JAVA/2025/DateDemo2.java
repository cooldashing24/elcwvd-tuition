import java.util.*;
class DateDemo2
{
	public static void main(String []args)
	{
		Date d1 = new Date();
		System.out.println("Current DateTime: " + d1);
		// Since 1970 Jan 1
		System.out.println("Millisecs: " + d1.getTime());
		
		long futureDate = d1.getTime() + 1557564;
		System.out.println("Future Millisecs: " + futureDate);
		d1.setTime(futureDate);
		System.out.println("Future DateTime: " + d1);
	}
}
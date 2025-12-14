import java.util.*;

class DateDemo
 {
	public static void main (String[] args)
	{
		Date d1 = new Date();
		System.out.println("Current DateTime: " + d1);
		// Since 1970 1, Jan
		System.out.println("Milli Secs : " + d1.getTime());

		long futureTime = d1.getTime() + 778410001;
		System.out.println("Future Secs: " + futureTime);

		d1.setTime(futureTime);
		System.out.println("Future DateTime: " + d1);
	}
 }
 

/*
 
 My3 - 7000, 8000, 10000, 50000, 2000, 1000   ->  ?
 Jaddu - 1700, 8000, 8000, 50, 80, 1000 ->  ?
 Nishi - 10000, 70000, 800, 5000, 8000, 1000 -> ?
 Parth - 2000, 15000, 7000, 1000, 2000,1000 -> ?
 Rajvi - 2000, 5000, 7000, 1000, 20000,100000 -> ?
 
*/
 
 
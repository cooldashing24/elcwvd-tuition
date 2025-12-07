class hmsDemo
{
	public static void main(String[]args) 
	{
		int h = 2, m = 80, s = 135;
		System.out.println("Hours: " + h);
		System.out.println("Minutes: " + m);
		System.out.println("Seconds: " + s);
		
		// Convert hours to seconds
		int totalSec = h * 3600;
		
		totalSec = totalSec  + (m * 60);
		
		totalSec += s;
		System.out.println("Total Seconds: " + totalSec);
	}
}










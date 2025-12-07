class HoursMinutesSecondsDemo
{
	public static void main(String[] args)
	{
		int h = 4, m = 90, s = 80;

		System.out.println("Hours: " + h);
		System.out.println("Minutes: " + m);
		System.out.println("Seconds: " + s);

		int totalSec = (h * 3600) + (m * 60) + s;
		System.out.println("Total Seconds: " + totalSec);

	}
}

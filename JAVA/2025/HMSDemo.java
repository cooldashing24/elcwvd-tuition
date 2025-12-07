class HMSDemo
{
	public static void main(String args[])
	{
		int h, m, s, totalSeconds = 10000;
		System.out.println("Total Seconds: " + totalSeconds);
		
		// hour/s
		h = totalSeconds / 3600;
		System.out.println("Hour/s: " + h);
		
		totalSeconds %= 3600;
		//System.out.println("Remaining Seconds: " + totalSeconds);
		
		// minute/s
		m = totalSeconds / 60;
		System.out.println("Minute/s: " + m);
		
		totalSeconds %= 60;
		System.out.println("Second/s: " + totalSeconds);
	}
}
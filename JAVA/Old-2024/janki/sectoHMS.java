class sectoHMS
{
	public static void main(String[] args)
	{
		int h , m , s , totalSeconds = 7858 , remSec ;
		h = totalSeconds/3600;
		remSec = totalSeconds%3600;
		m=remSec/60;
		s=remSec%60;
		
		System.out.println("Total Sec:" + totalSeconds );
		System.out.println("Hours:" + h);
		System.out.println("Min:" + m);
		System.out.println("Second:" + s);
		
		
	}
	
	
}
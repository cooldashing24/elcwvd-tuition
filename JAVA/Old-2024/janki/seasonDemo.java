class seasonDemo
{
	public static void main(String[] args )
	{
		int month = 10;
		System.out.println("Month:" + month);
		
		if(month==11 || month==12 || month==1 || month==2 )
		{
			System.out.println("Winter");
		}
		else if(month==3 || month==4 || month==5 || month==6 )
		{
			System.out.println("Summer");
		}
		else if(month==7 || month==8 || month==9 || month==10 )
		{
			System.out.println("Monsoon");
		}
		else
		{
			System.out.println("invalid");
		}	
		
		
	}
	
	
}
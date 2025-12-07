class TotalWagessDemo
{
	public static void main(String[] args)
	{
		double workedHours = 45.5, wagesPerHour = 15.7;

		System.out.println("Worked Hours: " + workedHours);
		System.out.println("Wages Per Hour: $" + wagesPerHour);
		
		double totWages = workedHours * wagesPerHour;
		System.out.println("Total Wages: $" + totWages);
	}
}

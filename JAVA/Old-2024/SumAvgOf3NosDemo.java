class SumAvgOf3NosDemo
{
	public static void main(String[] args)
	{
		double x = 45.8, y = 56.7, z = 43.2;
		
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
		System.out.println("Z: " + z);
		
		double sum = x + y + z;
		System.out.println("Total: " + sum);

		double avg = sum / 3;
		System.out.println("Average: " + avg);
		
	}
}
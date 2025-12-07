class ReverseStringDemo
{
	public static void main(String[] args)
	{
		String name = "133135";
		System.out.println("Naam: " + name);

		StringBuffer sb1 = new StringBuffer(name);

		sb1.reverse();
		System.out.println("Ultu Naam: " + sb1);
	}
}
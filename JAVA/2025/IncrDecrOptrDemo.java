class IncrDecrOptrDemo
{
	public static void main(String args[])
	{
		int x = 6, y = 0;
		System.out.println("X ni value: " + x);
		System.out.println("Y ni value: " + y);

		y = x++;
		//x = x + 1;
		//++x;
		System.out.println("X after ++: " + x);
		System.out.println("Y after x++: " + y);
		
		
		int z = ++y;
		System.out.println("Z after ++y: " + z);
		System.out.println("Y after ++y: " + y);
		
		System.out.println("-------------");
		System.out.println("X: " + x);
		x--;
		System.out.println("X after --: " + x);
		
		
		System.out.println("--x: " + --x);
		System.out.println("X after --x: " + x);
		
		System.out.println("x--: " + x--);
		System.out.println("X after x--: " + x);
		
		System.out.println("-------------");
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
		System.out.println("Z: " + z);
		
		int chupRehvo = x++ + ++y - z++;
		System.out.println("chupRehvo: " + chupRehvo);
	}
}





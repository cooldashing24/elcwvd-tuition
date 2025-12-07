class Room
{
	double length, width, height;
	byte nWin;
	
	void display()
	{
		System.out.println("--------------------");
		System.out.println("Lambai: " + length);
		System.out.println("Pohrai: " + width);
		System.out.println("Unchai: " + height);
		System.out.println("#Windows: " + nWin);
		System.out.println("Area: " + getArea());
		System.out.println("Vol: " + getVolume());
	}
	
	double getArea()
	{
		return length * width;
	}
	
	double getVolume()
	{
		//return length * width * height;
		return getArea() * height;
	}
	
	void setDetails(byte n, double l, double w, double h)
	{
		length = l;
		width = w;
		height = h;
		nWin = n;
	}
}

class RoomDemo2025B2
{
	public static void main(String[] args)
	{
		Room r1 = new Room();
		r1.setDetails((byte)4, 100.47, 52.7, 17.8);
		r1.display();
		
		Room r2 = new Room();
		r2.setDetails((byte)7, 143.65, 76.35, 18.15);
		r2.display();
		
	}
}







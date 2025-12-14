class Room
{
	double length, width, height;
	byte nWin;
	
	// Constructor
	Room()	// No Argument
	{
		setDetails(102.5, 55.17, 35.7, (byte)3);		// -> Angel
	}
	
	// parameterized constructor (4 parameters)
	Room(double l, double w, double h, byte n)
	{
		setDetails(l, w, h, n);
	}
	
	// parameterized constructor (2 parameters)
	Room(double lwh, byte n)	
	{
		setDetails(lwh, lwh, lwh, n);
	}

	
	void display()
	{
		System.out.println("---------------------");
		System.out.println("Lambai: " + length);
		System.out.println("Pohrai: " + width);
		System.out.println("Unchai: " + height);
		System.out.println("#Windows: " + nWin);
		System.out.println("Area: " + getArea());
	}
	
	double getArea()
	{
		return length * width;
	}
	
	// Method Overloading (Polymorphism)
	// A method with same name & having different signature/#parameters
	void setDetails(double l, double w, double h, byte n) // Angel
	{
		length = l;
		width = w;
		height = h;
		nWin = n;
	}

	void setDetails(double lwh, byte n)	// Honey
	{
		setDetails(lwh, lwh, lwh, n);
	}
	
	void setDetails()	// My3
	{
		setDetails(82.5, 65.7, 35.7, (byte)5);		// -> Angel
	}
}

class RoomConstructorDemo2025
{
	public static void main(String[] args)
	{
		Room r1 = new Room(125.5, 65.8, 24.7, (byte)4);
		r1.display();
		
		System.out.println("---------- Object 2 ----------");
		
		Room r2 = new Room(70.5, (byte)4);
		r2.display();
		
		System.out.println("---------- Object 3 ----------");
		
		Room r3 = new Room();
		r3.display();

		r3.setDetails();
		r3.display();
	}
}


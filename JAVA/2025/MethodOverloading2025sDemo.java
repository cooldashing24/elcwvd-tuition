class MethodOverloading2025sDemo
{
	public static void main(String []args)
	{
		Room r1 = new Room();
		r1.display();
		
		System.out.println("--------- Obj 2");
		Room r2 = new Room(78.25, (byte)7);
		r2.display();

		System.out.println("--------- Obj 3");
		Room r3 = new Room(78.125, (byte)4);
		r3.display();
	}
}

class Room
{
	double length, width, height;
	byte nWin;
	
	Room(double l, double w, double h, byte n)
	{
		setDetails(l, w, h, n);
		/*length = l;
		width = w; 
		height = h;
		nWin = n;
		**/
	}
	
	void display()
	{
		System.out.println("-----------------");
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
	// Polymorphism
	// Method Overloading
	// A method with same name but different signature/#parameters
	// heer
	void setDetails(double l, double w, double h, byte n)
	{
		length = l;
		width = w;
		height = h;
		nWin = n;
	}
	
	void setDetails(double lwh, byte n) // -> jay
	{
		setDetails(lwh, lwh, lwh, n); // -> heer
	}
	
	void setDetails() // -> anishka
	{
		setDetails(155.27, 32.7, 25.9, (byte)10); // -> heer
	}
	
	// No-argument constructor
	Room()
	{
		setDetails(105.27, 52.7, 15.9, (byte)10); // -> heer
	}
	
	// Parameterized constructor
	Room(double lwh, byte n)
	{
		setDetails(lwh, lwh, lwh, n);
	}
}

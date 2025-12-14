class Room
{
	double length, width, height;
	byte nWin;
	
	// Constructor is a special member function whose name is same as class name
	// No return type not even void
	// It is use to initialize an object
	
	// No argument constructor
	Room()
	{
		length = 120.55;
		width = 45.58;
		height = 15.24;
		nWin = 2;
	}
	
	void display()
	{
		System.out.println("-----------------");
		System.out.println("Lambai: " + length);
		System.out.println("Pohrai: " + width);
		System.out.println("Unchai: " + height);
		System.out.println("#Windows: " + nWin);
	}
	
	void setDetails(double l, double w, double h, byte n)
	{
		length = l;
		width = w;
		height = h;
		nWin = n;
	}
}

class RoomConstructorDemo
{
	public static void main(String []args)
	{
		Room r1 = new Room();
		r1.display();
		
		Room r2 = new Room();
		r2.display();
		
		r2.length = 122;
		r2.width= 28;
		r2.display();
	}
}

/*
Default Constructor: 
	Constructor created by JAVA
	*/







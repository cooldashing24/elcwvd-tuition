class Room
{
	double length, width, height;
	byte nWin;
	
	void display()
	{
		System.out.println("---------------------");
		System.out.println("Lambai: " + length);
		System.out.println("Pohrai: " + width);
		System.out.println("Unchai: " + height);
		System.out.println("#Windows: " + nWin);
		System.out.println("Area: " + getArea());
	}
	
	void display(String title)
	{
		// System.out.println("---------------------");
		System.out.println("--- Object " + title + " ---");
		display();
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
		/*
		length = lwh;
		width = lwh;
		height = lwh;
		nWin = n;
		*/
	}
	
	void setDetails()	// My3
	{
		setDetails(82.5, 65.7, 35.7, (byte)5);		// -> Angel
		// setDetails(82.5, (byte)5); // -> Honey -> Angel
		/*
		length = 78.5;
		width = 36.5;
		height = 12.7;
		nWin = (byte)5;
		*/
	}
}

class RoomMethodOverloadingDemo2025
{
	public static void main(String[] args)
	{
		Room r1 = new Room();
		r1.display();
		
		r1.setDetails(125.5, 65.8, 24.7, (byte)4);
		r1.display("Suprabhat");
		
		System.out.println("---------- Object 2 ----------");
		
		Room r2 = new Room();
		r2.display();
		
		r2.setDetails(70.5, (byte)4);
		r2.display();
		
		
		System.out.println("---------- Object 3 ----------");
		
		Room r3 = new Room();
		r3.setDetails();
		r3.display();
	}
}
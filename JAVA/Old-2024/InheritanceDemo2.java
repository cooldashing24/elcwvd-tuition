class Room
{
	double length, width, height;
	byte nWin;
	static int totWin;
	
	Room(double l, double w, double h, byte n)
	{
		setDetails(l, w, h, n);
	}
	
	Room(double lwh, byte n)
	{
		setDetails(lwh, lwh, lwh, n);
	}
	
	Room()
	{
		setDetails(85.7, 43.2, 25.44, (byte)4);
	}
	
	void setDetails(double l, double w, double h, byte n)
	{
		length = l;
		width = w;
		height = h;
		totWin = totWin - nWin + n;
		nWin = n;
	}
	
	void setDetails(double lwh, byte n)
	{
		setDetails(lwh, lwh, lwh, n);
	}
	
	void setDetails()
	{
		setDetails(75.2, 25.7, 20.4, (byte)4);
	}

	void display()
	{
		System.out.println("----------------");
		System.out.println("Lambai: " + length);
		System.out.println("Pohrai: " + width);
		System.out.println("Unchai: " + height);
		System.out.println("#Windows: " + nWin);
		System.out.println("Total # Windows: " + totWin);
		System.out.println("Area: " + getArea());
	}

	double getArea()
	{
		return length * width;
	}
}

class StudyRoom extends Room
{
	int nB, nSPB;
	
	StudyRoom()
	{
		super.setDetails(152.85, 63.14, 25.47, (byte)5);
		nB = 18;
		nSPB = 3;
	}
	
	StudyRoom(double l, double w, double h, byte n, int b, int spb)
	{
		super.setDetails(l, w, h, n);
		nB = b;
		nSPB = spb;
	}
	
	void show()
	{
		super.display();
		System.out.println("#Benches: " + nB);
		System.out.println("#Seat/Bench: " + nSPB);
		System.out.println("Total Seats: " + (nB * nSPB));
	}
	
	void setAttributes(double l, double w, double h, byte n, int b, int spb)
	{
		super.setDetails(l, w, h, n);
		nB = b;
		nSPB = spb;
	}
}

class InheritanceDemo2
{
	public static void main(String[] args)
	{
		StudyRoom sr1 = new StudyRoom();
		sr1.show();
		
		sr1.setAttributes(124.6, 63.35, 14.55, (byte)7, 35, 3);
		sr1.show();
		
		StudyRoom sr2 = new StudyRoom(67.57,25.23, 29.7,(byte)10, 30, 2);
		sr2.show();
		
	}
}
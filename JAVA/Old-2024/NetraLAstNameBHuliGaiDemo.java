class Room
{
	double length, width, height;
	byte nWin;
	static int totWin;
	
	Room()
	{
		setDetails(57.75, 36.63, 12.21, (byte)4);
	}
	
	Room(double l, double w, double h, byte n)
	{
		setDetails(l, w, h, n);
	}
	
	Room(double lwh, byte n)
	{
		setDetails(lwh, lwh, lwh, n);
	}
	
	void display()
	{
		System.out.println("----------------");
		System.out.println("Lambai: " + length);
		System.out.println("Pohrai: " + width);
		System.out.println("Unchai: " + height);
		System.out.println("#Windows: " + nWin);
		System.out.println("Total Windows: " + totWin);
		System.out.println("Area: " + getArea());
	}
	
	void setDetails(double l, double w, double h, byte n)
	{
		length = l;
		width= w;
		height = h;
		totWin = totWin - nWin + n;
		nWin = n;
		
	}
	
	void setDetails(double lwh, byte n)
	{
		setDetails(lwh, lwh, lwh, n);
	}
	
	double getArea()
	{
		return length * width;
	}
}

class StudyRoom extends Room
{
	int nB, nSPB;
	
	StudyRoom ()
	{
		super(79.55, 55.2, 14.25, (byte)5);
		nB = 35;
		nSPB = 2;
	}
	
	StudyRoom (double l, double w, double h, byte n, int nb, int nspb)
	{
		super(l, w, h, n);
		nB = nb;
		nSPB = nspb;
	}
	
	void show()
	{
		super.display();
		System.out.println("#Benches: " + nB);
		System.out.println("#Seat/Bench: " + nSPB);
		System.out.println("Toal Seats: " + (nB * nSPB));
	}
	
	void setAttributes(double l, double w, double h, byte n, int nb, int nspb)
	{
		super.setDetails(l, w, h, n);
		nB = nb;
		nSPB = nspb;
	}
}

class NetraLAstNameBHuliGaiDemo
{
	public static void main(String[] args)
	{
		StudyRoom sr1 = new StudyRoom();
		sr1.show();
		sr1.setAttributes(87.78, 57.87, 26.8, (byte)6, 30, 3);
		sr1.show();

		StudyRoom sr2 = new StudyRoom(128.55, 77.87, 26.8, (byte)5, 40, 3);
		sr2.show();
		
		/*Room r1 = new Room();
		r1.display();
		r1.setDetails(85.2, 47.1, 36.8, (byte)6);
		r1.display();
		
		Room r2 = new Room(87.78, 57.87, 26.8, (byte)6);
		r2.display();
		r2.setDetails(66.8, (byte)5);
		r2.display();
		
		Room r3 = new Room(44.25, (byte)4);
		r3.display();*/
	}
}
class Room
{
	double length, width, height;
	byte nWin;
	static int totalWin;
	
	Room()
	{
		setDetails(78.5, 42.2, 25.7, (byte) 6);
	}
	
	Room(double lwh, byte n)
	{
		setDetails(lwh, lwh, lwh, n);
	}
	
	Room(double l, double w, double h, byte n)
	{
		setDetails(l, w, h, n);
	}
	
	void display()
	{
		System.out.println("-------------------------");
		System.out.println("Lambai: " + length);
		System.out.println("Pohrai: " + width);
		System.out.println("Unchai: " + height);
		System.out.println("#Windows: " + nWin);
		System.out.println(" Total # Windows: " + totalWin);
	}
	
	void setDetails(double l, double w, double h, byte n)
	{
		length = l;
		width = w;
		height = h;
		totalWin = totalWin - nWin + n;
		nWin = n;
	}
	
	void setDetails(double lwh, byte n)
	{
		setDetails(lwh, lwh, lwh, n);
	}
}

class StudyRoom extends Room	// aka ClassRoom
{
	int nBenches, nSPB;
	
	StudyRoom()
	{
		super();	// invoking parent class constructor
		nBenches = 70;
		nSPB = 3;
	}
	
	StudyRoom(double l, double w, double h, byte n, int nB, int spb)
	{
		super(l, w, h, n);	// invoking parent class constructor
		nBenches = nB; 
		nSPB = spb;
	}

	void show()
	{
		super.display();
		System.out.println("# Benches: " + nBenches);
		System.out.println("# Seat/Bench: " + nSPB);
		System.out.println("Total # Seats:  " + (nBenches * nSPB));
	}
	
	void setAttributes(double l, double w, double h, byte n, int nB, int spb)
	{
		super.setDetails(l, w, h, n);
		nBenches = nB; 
		nSPB = spb;
	}
}
//
class InheritanceDemo
{
	public static void main(String[] args)
	{
		StudyRoom sr1 = new StudyRoom();
		sr1.show();
		sr1.setAttributes(145, 65.4, 14.7, (byte)4, 60, 3);
		sr1.show();
		
		StudyRoom sr2 = new StudyRoom(76, 65.4, 13.7, (byte)5, 50, 4);
		sr2.show();
		
		StudyRoom sr3 = new StudyRoom();
		sr3.setAttributes(76, 65.4, 13.7, (byte)7, 50, 4);
		sr3.show();
		
		
		
		
		/*Room r1 = new Room();
		r1.display();
		
		r1.setDetails(145, 65.4, 14.7, (byte)4);
		r1.display();
		
		
		Room r2 = new Room(64.58, 25.7, 14.7, (byte)3);
		r2.display();

		
		Room r3 = new Room(35.7, (byte)3);
		r3.display();
		r3.setDetails(87, (byte)3);
		r3.display();*/
		
	}
}


/*
p1: Person
---------------------
firstName: "Dezy"
lastName: "Galiawala"
-age: 18
---------------------
display(): void
getFullName(): String


p2: Person
---------------------
firstName: "Roshni"
lastName: "Galiawala"
-age: 37
---------------------
display(): void
getFullName(): String


*/
// Polymorphism: 

class AakarDemo
{
	public static void main(String[] args)
	{
		Box b1 = new Box();
		b1.show();
		b1.setAttributes(78.5, 55.2, 36.7);
		b1.show();
		
		Box b2 = new Box(96.3, 85.2, 47.1);
		b2.show();
		b2.setAttributes(85.5);
		b2.show();
	}
}

class Rectangle
{
	double length, width;
	
	Rectangle(double l, double w)
	{
		setDetails(l, w);
	}
	
	Rectangle()
	{
		setDetails(45.58, 16.6);
	}
	
	void display()
	{
		System.out.println("---------------------------");
		System.out.println("Lambai: " + length);
		System.out.println("Pohrai: " + width);
	}
	
	//getter
	double getArea()
	{
		return length * width;
	}
	
	void setDetails(double l, double w)
	{
		length = l;
		width = w;
	}
	
	void setDetails(double lw)
	{
		setDetails(lw, lw);
	}
}

class Box extends Rectangle
{
	double height;

	Box(double l, double w, double h)
	{
		super(l, w);
		setHeight(h);
	}
	
	Box()
	{
		super();
		setHeight(98.7);
	}
	
	void show()
	{
		super.display();
		System.out.println("Unchai: " + height);
		System.out.println("Area: " + super.getArea());
		System.out.println("Volume: " + getVolume());
	}
	
	double getVolume()
	{
		return super.getArea() * height;
	}
	
	void setAttributes(double l, double w, double h)
	{
		super.setDetails(l, w);
		setHeight(h);
	}
	
	void setAttributes(double lwh)
	{
		setAttributes(lwh, lwh, lwh);
	}
	
	// setter
	void setHeight(double h)
	{
		height = h;
	}
}


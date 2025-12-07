// Polymorphism -> method overloading, constructor overloading
// Getter / Setter

class ShapeDemo
{
	public static void main(String[] args)
	{
		Box b1 = new Box();
		b1.show();
		b1.setAttributes(75.25, 35.87, 23.47);
		b1.show();
		
		System.out.println("------------- Object 2 -------------");
		Box b2 = new Box(99.99, 55.55, 33.33);
		b2.show();
		b2.setAttributes(45.75);
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
		setDetails(78.22, 35.25);
	}
	
	void display()
	{
		System.out.println("---------------------------");
		System.out.println("Lambai: " + length);
		System.out.println("Pohrai: " + width);
	}
	
	// getter
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
		setHeight(37.22);
	}
	
	void show()
	{
		super.display();
		System.out.println("Unchai: " + height);
		System.out.println("Area: " + super.getArea());
		System.out.println("Volume: " + getVolume());
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
	
	double getVolume()
	{
		return super.getArea() * height;
	}
	
	void setHeight(double h)
	{
		height = h;
	}
}
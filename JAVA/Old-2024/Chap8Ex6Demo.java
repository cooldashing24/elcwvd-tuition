class Chap8Ex6Demo
{
	public static void main(String[] args)
	{
		Box b1 = new Box();
		b1.show();
		b1.setAttributes(85.14);
		b1.show();                                                                             
		
		Box b2 = new Box(74.6, 25.8, 39.6);
		b2.show();
		b2.setAttributes(78.35, 25.88, 37.14);
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
		setDetails(47.1, 25.8);
	}
	
	void display()
	{
		System.out.println("--------------------");
		System.out.println("Lambai: " + length);
		System.out.println("Pohrai: " + width);
	}

	// getter
	double getArea()
	{
		return  length * width;
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
		setHeight(58.6);
	}
	
	void show()
	{
		super.display();
		System.out.println("Unchai: " + height);
		System.out.println("Area: " + super.getArea());
		System.out.println("Volume: " + getVolume());
	}
	
	// getter
	double getVolume()
	{
		return height * super.getArea();
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

	//setter
	void setHeight(double hei)
	{
		height = hei;
	}
}


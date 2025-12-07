class Person
{
	String fname, lname;
	double weight;
	
	String getFullName()
	{
		return fname + " " + lname;
	}
	
	void myself()
	{
		System.out.println("------------------------------");
		System.out.println("First Name: " + fname);
		System.out.println("Last Name: " + lname);
		System.out.println("Weight: " + weight);
	}
}

class PersonDemo
{
	public static void main(String[] args)
	{
		double x =  8;
		System.out.println(x);

		Person p1 = new Person();
		p1.fname = "Zeel";
		p1.lname = "Chup Thai Ja Mata";
		p1.weight = 3.5;
		p1.myself();
			
		Person p2 = new Person();
		p2.fname = "Chandni";
		p2.lname = "Nahi Manti";
		p2.weight = 5.5;
		p2.myself();
	}
}



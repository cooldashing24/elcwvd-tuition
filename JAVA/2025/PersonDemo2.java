class Person
{
	String firstName, lastName;
	char gender;
	byte age;
}

class PersonDemo2
{
	public static void main(String[] args)
	{
		// declaration
		// DataType variable;
		byte x;
		//System.out.println(x);
		
		// declaration
		// DataType object;
		Person p1;
		
		p1 = new Person();
		// new -> instantiate -> memory allocation
		// Person() -> initialize -> assigning values
		
		System.out.println(p1);

		System.out.println(p1.firstName);
		System.out.println(p1.lastName);
		System.out.println(p1.gender);
		System.out.println(p1.age);
		
		
		System.out.println("---------");
		Person p2 = new Person();
		
		p2.firstName = "Honey";
		p2.lastName = "Dudhpakwala";
		p2.gender = 'F';
		p2.age = 5;

		System.out.println(p2.firstName);
		System.out.println(p2.lastName);
		System.out.println(p2.gender);
		System.out.println(p2.age);

		Person p3 = new Person();
	}
}
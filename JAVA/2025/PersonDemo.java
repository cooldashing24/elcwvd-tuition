/*class ClassName
{
	// [properties/attributes]

	// [functions/methods]
}
*/

class Person
{
	// properties
	String firstName, lastName;
	byte age;
	char gender;
	
	// methods
}

class PersonDemo
{
	public static void main(String[] args)
	{
		//dataType variableName;
		byte x;
		//System.out.println(x);
		//dataType objectName;
		Person p1;		// declaration
		
		p1 = new Person();
		System.out.println(p1);
		System.out.println("First name: " + p1.firstName);
		System.out.println("6elu naam: " + p1.lastName);
		System.out.println("Ummar: " + p1.age);
		System.out.println("Gen: " + p1.gender);

		/*
		declaration
		instantiation -> memory allocation/assignment
		initialization -> value assignment
		*/

		Person p2 = new Person();
		
		p2.firstName = "Khushi";
		p2.lastName = "Bardolia";
		p2.age = 3;
		p2.gender = 'F';
		
		System.out.println("First name: " + p2.firstName);
		System.out.println("6elu naam: " + p2.lastName);
		System.out.println("Ummar: " + p2.age);
		System.out.println("Gen: " + p2.gender);
		
		
		Person p3 = new Person();
	}
}







import java.util.*;

class Person
{
	String firstName, lastName;
	GregorianCalendar birthdate;
	private String password;
	
	Person()
	{
		birthdate = new GregorianCalendar();
	}
	
	void mySelf()
	{
		System.out.println("-----------------------");
		System.out.println("Pehlu naam: " + firstName);
		System.out.println("6elu naam: " + lastName);
		System.out.print("DOB: ");
		System.out.print(birthdate.get(birthdate.DAY_OF_MONTH) + "-");
		System.out.print(birthdate.get(birthdate.MONTH) + "-");
		System.out.println(birthdate.get(birthdate.YEAR));
		
		
		System.out.println("Password: " + password);
	}
}

class PersonDemoB2
{
	public static void main(String[] args)
	{
		Person dhara =  new Person();
		
		dhara.mySelf();
	}
}


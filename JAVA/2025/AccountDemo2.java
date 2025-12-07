class Account
{
	double bal;
	String acno, name, type;
	
	void display()
	{
		System.out.println("--------------------");
		System.out.println("A/C #: " + acno);
		System.out.println("A/C Holder: " + name);
		System.out.println("A/C Balance: " + bal);
		System.out.println("A/C Type: " + type);
	}
	
	void setDetails(String no, String n, String t, double b)
	{
		bal = b;
		acno = no;
		name = n;
		type = t;
	}
	
	void deposit(double amt)
	{
		bal = bal + amt;
		System.out.println("Jama Amount: " + amt);
		System.out.println("New Balance: " + bal);
	}
	
	void withdraw(double amt)
	{
		bal = bal - amt;
		System.out.println("Upad Amount: " + amt);
		System.out.println("New Balance: " + bal);
	}
}

class AccountDemo2
{
	public static void main(String[] angel)
	{
		Account a1 = new Account();
		a1.setDetails("123456790", "Prachi", "Savings", 7895.5);
		a1.display();
		a1.deposit(200);
		

		Account a2 = new Account();
		a2.setDetails("123456791", "Selvi", "Current", 70895.5);
		a2.display();
		a2.withdraw(2000);
	}
}
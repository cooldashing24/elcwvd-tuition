class InvalidTransactionException extends Exception
{
	// Special function whose name is same as class Name

	InvalidTransactionException()
	{
		super("Withdraw amount must be less than balance");
	}
}

class Chap10Ex6Demo1
{
	public static void main(String[] args)
	{
		double balanceAmount = 7000, withdrawAmount = 70001;
		
		System.out.println("Balance: " + balanceAmount);
		System.out.println("Withdraw: " + withdrawAmount);
		try
		{
			if (balanceAmount < withdrawAmount)
			{
				throw (new InvalidTransactionException());
			}
		}
		catch(InvalidTransactionException e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
}
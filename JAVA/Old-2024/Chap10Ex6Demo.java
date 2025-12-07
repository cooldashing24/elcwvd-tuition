class InvalidTransactionException extends Exception
{
	InvalidTransactionException()
	{
		super("Balance less than withdrawal amount.");
	}
}

class Chap10Ex6Demo
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
				/*InvalidTransactionException e = new InvalidTransactionException();
				throw e;*/
				throw (new InvalidTransactionException());
			}
		}
		catch(InvalidTransactionException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
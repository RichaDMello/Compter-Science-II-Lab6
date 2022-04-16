
public class CheckingAccount extends BankAccount{
	
	private static final double FEE=0.15;
	
	public CheckingAccount(String name, double amount)
	{
		super(name, amount);
		super.setAccountNumber(super.getAccountNumber()+"-10");
	}
	
	@Override
	public boolean withdraw(double amount)
	{
		amount = amount + FEE;
		
		boolean completed = true;

		if (amount <= super.getBalance())
		{
			super.setBalance(super.getBalance()-amount);
		}
		else
		{
			completed = false;
		}
		return completed;
	}
	

}

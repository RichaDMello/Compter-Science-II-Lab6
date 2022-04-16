
public class SavingsAccount extends BankAccount{

	private double rate = 2.5;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amt)
	{
		super(name, amt);
		this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
	}
	
	public void postInterest()
	{
		double interest;
		interest = super.getBalance()*(2.5/100)/12;
		this.deposit(interest);
	}
	
	@Override
	public String getAccountNumber()
	{
		return this.accountNumber;
	}
	
	public SavingsAccount(SavingsAccount s, double balance)
	{
		super(s, balance);
		this.savingsNumber++;
		this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
	}
	
}

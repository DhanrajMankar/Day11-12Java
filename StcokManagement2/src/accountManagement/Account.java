package accountManagement;

public class Account {

	private int amount;

	public int getAmmount() {
		return amount;
	}

	public void setAmmount(int amount) {
		this.amount = amount;
	}

	public Account(int amount) {
		super();
		this.amount = amount;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Account [amount=" + amount + "]";
	}
	
	public void debitAmount(int debitAmount)
	{
		if(amount>debitAmount)
		{
			amount = amount -debitAmount;
			System.out.print("Amount debited successfully your balance is : "+amount);
		}
		else
		{
			System.out.print("Your account balance is NOT sufficient ,your balance is "+amount);
		}
	}
	public void creditAmount(int creditAmount)
	{
		amount = amount +creditAmount;
		System.out.print("Amount credited successfully your balance is : "+amount);
	}
}

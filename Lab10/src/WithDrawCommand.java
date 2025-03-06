public class WithDrawCommand implements Command
{
	private BankAccount bankAccount;
	private double amount;

	public WithDrawCommand (BankAccount account, double amount){
		this.bankAccount =account;
		this.amount= amount;
	}

	@Override
	public void Execute() {
		bankAccount.withdraw(amount);
	}
}

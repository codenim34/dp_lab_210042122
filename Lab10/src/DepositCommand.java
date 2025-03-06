public class DepositCommand implements Command{

	private BankAccount bankAccount;
	private double amount;


	public DepositCommand(BankAccount account, double amount) {
		this.bankAccount = account;
		this.amount = amount;
	}
	@Override
	public void Execute() {
		bankAccount.Deposit(amount);
	} 
}
